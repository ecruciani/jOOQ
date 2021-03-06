/**
 * Copyright (c) 2009-2013, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.jooq.test;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import junit.framework.Assert;

import org.jooq.ArrayRecord;
import org.jooq.DAO;
import org.jooq.DataType;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Record;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Record6;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.Schema;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableRecord;
import org.jooq.UDTRecord;
import org.jooq.UpdatableRecord;
import org.jooq.UpdatableTable;
import org.jooq.conf.Settings;
import org.jooq.impl.Executor;
import org.jooq.test._.TestStatisticsListener;
import org.jooq.test._.converters.Boolean_10;
import org.jooq.test._.converters.Boolean_TF_LC;
import org.jooq.test._.converters.Boolean_TF_UC;
import org.jooq.test._.converters.Boolean_YES_NO_LC;
import org.jooq.test._.converters.Boolean_YES_NO_UC;
import org.jooq.test._.converters.Boolean_YN_LC;
import org.jooq.test._.converters.Boolean_YN_UC;
import org.jooq.tools.JooqLogger;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;
import org.jooq.types.UShort;

public abstract class BaseTest<

    // T_AUTHOR table
    A extends UpdatableRecord<A> & Record6<Integer, String, String, Date, Integer, ?>,

    // T_AUTHOR pojo
    AP,

    // T_BOOK table
    B extends UpdatableRecord<B>,

    // T_BOOK_STORE table
    S extends UpdatableRecord<S> & Record1<String>,

    // T_BOOK_TO_BOOK_STORE table
    B2S extends UpdatableRecord<B2S> & Record3<String, Integer, Integer>,

    // MULTI_SCHEMA.T_BOOK_SALE table
    BS extends UpdatableRecord<BS>,

    // V_LIBRARY view
    L extends TableRecord<L> & Record2<String, String>,

    // T_ARRAYS table
    X extends TableRecord<X>,

    // T_DATES table
    DATE extends UpdatableRecord<DATE>,

    // T_BOOLEANS table
    BOOL extends UpdatableRecord<BOOL>,

    // T_DIRECTORY table
    D extends UpdatableRecord<D>,

    // T_TRIGGERS table
    T extends UpdatableRecord<T>,

    // T_UNSIGNED table
    U extends TableRecord<U>,

    // T_1624_UUID table
    UU extends UpdatableRecord<UU>,

    // T_IDENTITY table
    I extends TableRecord<I>,

    // T_IDENTITY_PK table
    IPK extends UpdatableRecord<IPK>,

    // Various tables related to trac ticket numbers
    T725 extends UpdatableRecord<T725>,
    T639 extends UpdatableRecord<T639>,
    T785 extends TableRecord<T785>> {

    protected static final List<Short>     BOOK_IDS_SHORT     = Arrays.asList((short) 1, (short) 2, (short) 3, (short) 4);
    protected static final List<Integer>   BOOK_IDS           = Arrays.asList(1, 2, 3, 4);
    protected static final List<Integer>   BOOK_AUTHOR_IDS    = Arrays.asList(1, 1, 2, 2);
    protected static final List<String>    BOOK_TITLES        = Arrays.asList("1984", "Animal Farm", "O Alquimista", "Brida");
    protected static final List<String>    BOOK_FIRST_NAMES   = Arrays.asList("George", "George", "Paulo", "Paulo");
    protected static final List<String>    BOOK_LAST_NAMES    = Arrays.asList("Orwell", "Orwell", "Coelho", "Coelho");
    protected static final List<Object>    BOOK_NULLS         = Arrays.asList(null, null, null, null);
    protected static final List<Integer>   AUTHOR_IDS         = Arrays.asList(1, 2);
    protected static final List<String>    AUTHOR_FIRST_NAMES = Arrays.asList("George", "Paulo");
    protected static final List<String>    AUTHOR_LAST_NAMES  = Arrays.asList("Orwell", "Coelho");
    protected static final List<Object>    AUTHOR_NULLS       = Arrays.asList(null, null);

    protected static final JooqLogger      log                = JooqLogger.getLogger(jOOQAbstractTest.class);

    protected final jOOQAbstractTest<A, AP, B, S, B2S, BS, L, X, DATE, BOOL, D, T, U, UU, I, IPK, T725, T639, T785> delegate;

    protected BaseTest(jOOQAbstractTest<A, AP, B, S, B2S, BS, L, X, DATE, BOOL, D, T, U, UU, I, IPK, T725, T639, T785> delegate) {
        this.delegate = delegate;
    }

    protected Table<T725> T725() {
        return delegate.T725();
    }

    protected TableField<T725, Integer> T725_ID() {
        return delegate.T725_ID();
    }

    protected TableField<T725, byte[]> T725_LOB() {
        return delegate.T725_LOB();
    }

    protected Table<T639> T639() {
        return delegate.T639();
    }

    protected TableField<T639, Integer> T639_ID() {
        return delegate.T639_ID();
    }

    protected TableField<T639, BigDecimal> T639_BIG_DECIMAL() {
        return delegate.T639_BIG_DECIMAL();
    }

    protected TableField<T639, BigInteger> T639_BIG_INTEGER() {
        return delegate.T639_BIG_INTEGER();
    }

    protected TableField<T639, Byte> T639_BYTE() {
        return delegate.T639_BYTE();
    }

    protected TableField<T639, Byte> T639_BYTE_DECIMAL() {
        return delegate.T639_BYTE_DECIMAL();
    }

    protected TableField<T639, Short> T639_SHORT() {
        return delegate.T639_SHORT();
    }

    protected TableField<T639, Short> T639_SHORT_DECIMAL() {
        return delegate.T639_SHORT_DECIMAL();
    }

    protected TableField<T639, Integer> T639_INTEGER() {
        return delegate.T639_INTEGER();
    }

    protected TableField<T639, Integer> T639_INTEGER_DECIMAL() {
        return delegate.T639_INTEGER_DECIMAL();
    }

    protected TableField<T639, Long> T639_LONG() {
        return delegate.T639_LONG();
    }

    protected TableField<T639, Long> T639_LONG_DECIMAL() {
        return delegate.T639_LONG_DECIMAL();
    }

    protected TableField<T639, Double> T639_DOUBLE() {
        return delegate.T639_DOUBLE();
    }

    protected TableField<T639, Float> T639_FLOAT() {
        return delegate.T639_FLOAT();
    }

    protected Table<T785> T785() {
        return delegate.T785();
    }

    protected TableField<T785, Integer> T785_ID() {
        return delegate.T785_ID();
    }

    protected TableField<T785, String> T785_NAME() {
        return delegate.T785_NAME();
    }

    protected TableField<T785, String> T785_VALUE() {
        return delegate.T785_VALUE();
    }

    protected Table<U> TUnsigned() {
        return delegate.TUnsigned();
    }

    protected TableField<U, UByte> TUnsigned_U_BYTE() {
        return delegate.TUnsigned_U_BYTE();
    }

    protected TableField<U, UShort> TUnsigned_U_SHORT() {
        return delegate.TUnsigned_U_SHORT();
    }

    protected TableField<U, UInteger> TUnsigned_U_INT() {
        return delegate.TUnsigned_U_INT();
    }

    protected TableField<U, ULong> TUnsigned_U_LONG() {
        return delegate.TUnsigned_U_LONG();
    }

    protected Table<UU> TExoticTypes() {
        return delegate.TExoticTypes();
    }

    protected TableField<UU, Integer> TExoticTypes_ID() {
        return delegate.TExoticTypes_ID();
    }

    protected TableField<UU, UUID> TExoticTypes_UUID() {
        return delegate.TExoticTypes_UUID();
    }

    public Table<DATE> TDates() {
        return delegate.TDates();
    }

    @SuppressWarnings("unchecked")
    protected final TableField<DATE, Integer> TDates_ID() {
        return (TableField<DATE, Integer>) getField(TDates(), "ID");
    }

    @SuppressWarnings("unchecked")
    protected final TableField<DATE, Date> TDates_D() {
        return (TableField<DATE, Date>) getField(TDates(), "D");
    }

    @SuppressWarnings("unchecked")
    protected final TableField<DATE, Time> TDates_T() {
        return (TableField<DATE, Time>) getField(TDates(), "T");
    }

    @SuppressWarnings("unchecked")
    protected final TableField<DATE, Timestamp> TDates_TS() {
        return (TableField<DATE, Timestamp>) getField(TDates(), "TS");
    }

    public UpdatableTable<BOOL> TBooleans() {
        return delegate.TBooleans();
    }

    public TableField<BOOL, Integer> TBooleans_ID() {
        return delegate.TBooleans_ID();
    }

    public TableField<BOOL, Boolean_10> TBooleans_BOOLEAN_10() {
        return delegate.TBooleans_BOOLEAN_10();
    }

    public TableField<BOOL, Boolean_TF_LC> TBooleans_Boolean_TF_LC() {
        return delegate.TBooleans_Boolean_TF_LC();
    }

    public TableField<BOOL, Boolean_TF_UC> TBooleans_Boolean_TF_UC() {
        return delegate.TBooleans_Boolean_TF_UC();
    }

    public TableField<BOOL, Boolean_YN_LC> TBooleans_Boolean_YN_LC() {
        return delegate.TBooleans_Boolean_YN_LC();
    }

    public TableField<BOOL, Boolean_YN_UC> TBooleans_Boolean_YN_UC() {
        return delegate.TBooleans_Boolean_YN_UC();
    }

    public TableField<BOOL, Boolean_YES_NO_LC> TBooleans_Boolean_YES_NO_LC() {
        return delegate.TBooleans_Boolean_YES_NO_LC();
    }

    public TableField<BOOL, Boolean_YES_NO_UC> TBooleans_Boolean_YES_NO_UC() {
        return delegate.TBooleans_Boolean_YES_NO_UC();
    }

    public TableField<BOOL, Boolean> TBooleans_VC() {
        return delegate.TBooleans_VC();
    }

    public TableField<BOOL, Boolean> TBooleans_C() {
        return delegate.TBooleans_C();
    }

    public TableField<BOOL, Boolean> TBooleans_N() {
        return delegate.TBooleans_N();
    }

    protected Table<X> TArrays() {
        return delegate.TArrays();
    }

    protected TableField<X, Integer> TArrays_ID() {
        return delegate.TArrays_ID();
    }

    protected TableField<X, String[]> TArrays_STRING() {
        return delegate.TArrays_STRING();
    }

    protected TableField<X, Integer[]> TArrays_NUMBER() {
        return delegate.TArrays_NUMBER();
    }

    protected TableField<X, Date[]> TArrays_DATE() {
        return delegate.TArrays_DATE();
    }

    protected TableField<X, ? extends UDTRecord<?>[]> TArrays_UDT() {
        return delegate.TArrays_UDT();
    }

    protected TableField<X, ? extends ArrayRecord<String>> TArrays_STRING_R() {
        return delegate.TArrays_STRING_R();
    }

    protected TableField<X, ? extends ArrayRecord<Integer>> TArrays_NUMBER_R() {
        return delegate.TArrays_NUMBER_R();
    }

    protected TableField<X, ? extends ArrayRecord<Long>> TArrays_NUMBER_LONG_R() {
        return delegate.TArrays_NUMBER_LONG_R();
    }

    protected TableField<X, ? extends ArrayRecord<Date>> TArrays_DATE_R() {
        return delegate.TArrays_DATE_R();
    }

    protected DAO<A, AP, Integer> TAuthorDao() {
        return delegate.TAuthorDao();
    }

    protected Class<AP> TAuthorPojo() {
        return delegate.TAuthorPojo();
    }

    protected Class<?> TBookPojo() {
        return delegate.TBookPojo();
    }

    protected Class<?> TBooleansPojo() {
        return delegate.TBooleansPojo();
    }

    protected UpdatableTable<A> TAuthor() {
        return delegate.TAuthor();
    }

    protected TableField<A, String> TAuthor_LAST_NAME() {
        return delegate.TAuthor_LAST_NAME();
    }

    protected TableField<A, String> TAuthor_FIRST_NAME() {
        return delegate.TAuthor_FIRST_NAME();
    }

    protected TableField<A, Date> TAuthor_DATE_OF_BIRTH() {
        return delegate.TAuthor_DATE_OF_BIRTH();
    }

    protected TableField<A, Integer> TAuthor_YEAR_OF_BIRTH() {
        return delegate.TAuthor_YEAR_OF_BIRTH();
    }

    protected TableField<A, Integer> TAuthor_ID() {
        return delegate.TAuthor_ID();
    }

    protected TableField<A, ? extends UDTRecord<?>> TAuthor_ADDRESS() {
        return delegate.TAuthor_ADDRESS();
    }

    protected Class<? extends UDTRecord<?>> cUAddressType() {
        return delegate.cUAddressType();
    }

    protected Class<? extends UDTRecord<?>> cUStreetType() {
        return delegate.cUStreetType();
    }

    protected UpdatableTable<B> TBook() {
        return delegate.TBook();
    }

    protected TableField<B, Integer> TBook_ID() {
        return delegate.TBook_ID();
    }

    protected TableField<B, Integer> TBook_AUTHOR_ID() {
        return delegate.TBook_AUTHOR_ID();
    }

    protected TableField<B, String> TBook_TITLE() {
        return delegate.TBook_TITLE();
    }

    protected TableField<B, Integer> TBook_LANGUAGE_ID() {
        return delegate.TBook_LANGUAGE_ID();
    }

    protected TableField<B, Integer> TBook_PUBLISHED_IN() {
        return delegate.TBook_PUBLISHED_IN();
    }

    protected TableField<B, String> TBook_CONTENT_TEXT() {
        return delegate.TBook_CONTENT_TEXT();
    }

    protected TableField<B, byte[]> TBook_CONTENT_PDF() {
        return delegate.TBook_CONTENT_PDF();
    }

    protected TableField<B, Timestamp> TBook_REC_TIMESTAMP() {
        return delegate.TBook_REC_TIMESTAMP();
    }

    protected TableField<B, Integer> TBook_REC_VERSION() {
        return delegate.TBook_REC_VERSION();
    }

    protected TableField<B, ? extends Enum<?>> TBook_STATUS() {
        return delegate.TBook_STATUS();
    }

    protected ForeignKey<B, A> FK_T_BOOK_AUTHOR_ID() {
        return delegate.FK_T_BOOK_AUTHOR_ID();
    }

    protected ForeignKey<B, A> FK_T_BOOK_CO_AUTHOR_ID() {
        return delegate.FK_T_BOOK_CO_AUTHOR_ID();
    }

    protected UpdatableTable<S> TBookStore() {
        return delegate.TBookStore();
    }

    protected TableField<S, String> TBookStore_NAME() {
        return delegate.TBookStore_NAME();
    }

    protected Table<L> VLibrary() {
        return delegate.VLibrary();
    }

    protected Table<?> VAuthor() {
        return delegate.VAuthor();
    }

    protected Table<?> VBook() {
        return delegate.VBook();
    }

    protected TableField<L, String> VLibrary_TITLE() {
        return delegate.VLibrary_TITLE();
    }

    protected TableField<L, String> VLibrary_AUTHOR() {
        return delegate.VLibrary_AUTHOR();
    }

    protected UpdatableTable<B2S> TBookToBookStore() {
        return delegate.TBookToBookStore();
    }

    protected TableField<B2S, Integer> TBookToBookStore_BOOK_ID() {
        return delegate.TBookToBookStore_BOOK_ID();
    }

    protected TableField<B2S, String> TBookToBookStore_BOOK_STORE_NAME() {
        return delegate.TBookToBookStore_BOOK_STORE_NAME();
    }

    protected TableField<B2S, Integer> TBookToBookStore_STOCK() {
        return delegate.TBookToBookStore_STOCK();
    }

    protected UpdatableTable<BS> TBookSale() {
        return delegate.TBookSale();
    }

    protected TableField<BS, Integer> TBookSale_ID() {
        return delegate.TBookSale_ID();
    }

    protected TableField<BS, Integer> TBookSale_BOOK_ID() {
        return delegate.TBookSale_BOOK_ID();
    }

    protected TableField<BS, String> TBookSale_BOOK_STORE_NAME() {
        return delegate.TBookSale_BOOK_STORE_NAME();
    }

    protected TableField<BS, Date> TBookSale_SOLD_AT() {
        return delegate.TBookSale_SOLD_AT();
    }

    protected TableField<BS, BigDecimal> TBookSale_SOLD_FOR() {
        return delegate.TBookSale_SOLD_FOR();
    }

    protected UpdatableTable<D> TDirectory() {
        return delegate.TDirectory();
    }

    protected TableField<D, Integer> TDirectory_ID() {
        return delegate.TDirectory_ID();
    }

    protected TableField<D, Integer> TDirectory_PARENT_ID() {
        return delegate.TDirectory_PARENT_ID();
    }

    protected TableField<D, Integer> TDirectory_IS_DIRECTORY() {
        return delegate.TDirectory_IS_DIRECTORY();
    }

    protected TableField<D, String> TDirectory_NAME() {
        return delegate.TDirectory_NAME();
    }

    protected UpdatableTable<T> TTriggers() {
        return delegate.TTriggers();
    }

    protected TableField<T, Integer> TTriggers_ID_GENERATED() {
        return delegate.TTriggers_ID_GENERATED();
    }

    protected TableField<T, Integer> TTriggers_ID() {
        return delegate.TTriggers_ID();
    }

    protected TableField<T, Integer> TTriggers_COUNTER() {
        return delegate.TTriggers_COUNTER();
    }

    protected Table<I> TIdentity() {
        return delegate.TIdentity();
    }

    protected TableField<I, Integer> TIdentity_ID() {
        return delegate.TIdentity_ID();
    }

    protected TableField<I, Integer> TIdentity_VAL() {
        return delegate.TIdentity_VAL();
    }

    protected UpdatableTable<IPK> TIdentityPK() {
        return delegate.TIdentityPK();
    }

    protected TableField<IPK, Integer> TIdentityPK_ID() {
        return delegate.TIdentityPK_ID();
    }

    protected TableField<IPK, Integer> TIdentityPK_VAL() {
        return delegate.TIdentityPK_VAL();
    }

    protected Field<? extends Number> FAuthorExistsField(String authorName) {
        return delegate.FAuthorExistsField(authorName);
    }

    protected Field<? extends Number> FOneField() {
        return delegate.FOneField();
    }

    protected Field<? extends Number> FNumberField(Number n) {
        return delegate.FNumberField(n);
    }

    protected Field<? extends Number> FNumberField(Field<? extends Number> n) {
        return delegate.FNumberField(n);
    }

    protected Field<? extends Number> F317Field(Number n1, Number n2, Number n3, Number n4) {
        return delegate.F317Field(n1, n2, n3, n4);
    }

    protected Field<? extends Number> F317Field(Field<? extends Number> n1, Field<? extends Number> n2,
        Field<? extends Number> n3, Field<? extends Number> n4) {
        return delegate.F317Field(n1, n2, n3, n4);
    }

    protected Field<Result<Record>> FGetOneCursorField(Integer[] array) {
        return delegate.FGetOneCursorField(array);
    }

    protected Field<Integer[]> FArrays1Field(Field<Integer[]> array) {
        return delegate.FArrays1Field(array);
    }

    protected Field<Long[]> FArrays2Field(Field<Long[]> array) {
        return delegate.FArrays2Field(array);
    }

    protected Field<String[]> FArrays3Field(Field<String[]> array) {
        return delegate.FArrays3Field(array);
    }

    protected <Z extends ArrayRecord<Integer>> Field<Z> FArrays1Field_R(Field<Z> array) {
        return delegate.FArrays1Field_R(array);
    }

    protected <Z extends ArrayRecord<Long>> Field<Z> FArrays2Field_R(Field<Z> array) {
        return delegate.FArrays2Field_R(array);
    }

    protected <Z extends ArrayRecord<String>> Field<Z> FArrays3Field_R(Field<Z> array) {
        return delegate.FArrays3Field_R(array);
    }

    protected boolean supportsOUTParameters() {
        return delegate.supportsOUTParameters();
    }

    protected boolean supportsReferences() {
        return delegate.supportsReferences();
    }

    protected boolean supportsRecursiveQueries() {
        return delegate.supportsRecursiveQueries();
    }

    protected Class<?> cRoutines() {
        return delegate.cRoutines();
    }

    protected Class<?> cLibrary() {
        return delegate.cLibrary();
    }

    protected Class<?> cSequences() {
        return delegate.cSequences();
    }

    protected DataType<?>[] getCastableDataTypes() {
        return delegate.getCastableDataTypes();
    }

    protected Executor create(Settings settings) {
        Executor create = delegate.create(settings);
        create.getExecuteListeners().add(new TestStatisticsListener());
        return create;
    }

    protected final Connection getConnection() {
        return delegate.getConnection();
    }

    protected final Connection getConnectionMultiSchema() {
        return delegate.getConnectionMultiSchema();
    }

    protected final Connection getNewConnection() {
        return delegate.getConnection0(null, null);
    }

    protected final Executor create() {
        return delegate.create();
    }

    protected final SQLDialect getDialect() {
        return delegate.getDialect();
    }

    protected final void sleep(long millis) {
        try {
            Thread.sleep(millis);
        }
        catch (InterruptedException ignore) {}
    }

    /**
     * Round all strings to a given scale, to avoid annoying floating point side-effects
     */
    protected static String[] roundStrings(int n, String... strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = "" + new BigDecimal(strings[i]).setScale(n, RoundingMode.HALF_UP);
        }

        return strings;
    }

    /**
     * Convenience method to create a new dummy book
     */
    protected final B newBook(int id) {
        B record = create().newRecord(TBook());

        record.setValue(TBook_ID(), id);
        record.setValue(TBook_AUTHOR_ID(), 1);
        record.setValue(TBook_TITLE(), "XX");
        record.setValue(TBook_PUBLISHED_IN(), 2000);
        record.setValue(TBook_LANGUAGE_ID(), 1);

        return record;
    }

    /**
     * Convenience method to get an author
     */
    protected final A getAuthor(int id) {
        return create().selectFrom(TAuthor())
                       .where(TAuthor_ID().equal(id))
                       .fetchOne();
    }

    /**
     * Convenience method to get a book
     */
    protected final B getBook(int id) {
        return create().selectFrom(TBook())
                       .where(TBook_ID().equal(id))
                       .fetchOne();
    }

    @SuppressWarnings("unchecked")
    protected Sequence<? extends Number> SAuthorID() throws IllegalAccessException, NoSuchFieldException {
        return (Sequence<? extends Number>) cSequences().getField("S_AUTHOR_ID").get(cSequences());
    }

    @SuppressWarnings("deprecation")
    protected final Schema schema() {
        Schema schema = TAuthor().getSchema();
        Schema mapped = create().getSchemaMapping().map(schema);

        return mapped != null ? mapped : schema;
    }

    protected final Field<?> getField(Table<?> table, String name) {
        Field<?> result = table.field(name);

        if (result == null) {
            result = table.field(name.toUpperCase());
        }

        if (result == null) {
            result = table.field(name.toLowerCase());
        }

        return result;
    }

    protected final Table<?> getTable(String name) throws Exception {
        Schema schema = TAuthor().getSchema();

        if (schema == null) {
            Class<?> tables = Class.forName("org.jooq.test." + getDialect().getName().toLowerCase() + ".generatedclasses.Tables");
            return (Table<?>) tables.getField(name).get(tables);
        }
        else {
            Table<?> result = schema.getTable(name);

            if (result == null) {
                result = schema.getTable(name.toUpperCase());
            }

            if (result == null) {
                result = schema.getTable(name.toLowerCase());
            }

            return result;
        }
    }

    /**
     * Reflection helper
     */
    @SuppressWarnings("unchecked")
    protected <R> R invoke(Class<?> clazz, String methodName, Object... parameters) throws Exception {
        return (R) invoke0(clazz, clazz, methodName, parameters);
    }

    /**
     * Reflection helper
     */
    @SuppressWarnings("unchecked")
    protected <R> R  invoke(Object object, String methodName, Object... parameters) throws Exception {
        return (R) invoke0(object.getClass(), object, methodName, parameters);
    }

    /**
     * Reflection helper
     */
    private Object invoke0(Class<?> clazz, Object object, String methodName, Object... parameters) throws Exception {
        for (Method method : clazz.getMethods()) {
            if (method.getName().equals(methodName)) {
                try {
                    return method.invoke(object, parameters);
                }
                catch (IllegalArgumentException ignore) {
                }
            }
        }

        // If there was no matching method and we have DUMMY parameters
        // Try removing them first. DUMMY parameters are used in SQL Server
        if (Arrays.asList(parameters).contains(DUMMY_OUT_INT)) {
            List<Object> alternative = new ArrayList<Object>(Arrays.asList(parameters));
            while (alternative.remove(DUMMY_OUT_INT));
            return invoke0(clazz, object, methodName, alternative.toArray());
        }

        throw new NoSuchMethodException();
    }

    // Dummy parameters for SQL Server
    protected static Integer DUMMY_OUT_INT = new Integer(0);

    protected static void assertSame(Collection<?> expected, Collection<?> actual) {
        if (!new HashSet<Object>(expected).equals(new HashSet<Object>(actual))) {
            Assert.fail("Collections aren't the same : " + expected + " and " + actual);
        }
    }
}
