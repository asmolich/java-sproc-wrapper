
package de.zalando.sprocwrapper.example;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.joda.time.DateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Repository;

import de.zalando.sprocwrapper.AbstractSProcService;
import de.zalando.sprocwrapper.dsprovider.ArrayDataSourceProvider;

/**
 * @author  jmussler
 */
@Repository
public class ExampleSProcServiceImpl extends AbstractSProcService<ExampleSProcService, ArrayDataSourceProvider>
    implements ExampleSProcService {

    @Autowired
    public ExampleSProcServiceImpl(@Qualifier("testDataSourceProvider") final ArrayDataSourceProvider p) {
        super(p, ExampleSProcService.class);
    }

    @Override
    public void createArticleSimples(final List<String> skus) {
        sproc.createArticleSimples(skus);
    }

    @Override
    public String createArticleSimpleItems(final String sku, final int stockId, final int quantity,
            final int purchasePrice, final String referenceNumber) {
        if (sku == null) {
            throw new IllegalArgumentException("SKU");
        }

        return sproc.createArticleSimpleItems(sku, stockId, quantity, purchasePrice, referenceNumber);
    }

    @Override
    public Integer getSimpleInt() {
        return sproc.getSimpleInt();
    }

    @Override
    public int getSimpleIntAsPrimitive() {
        return sproc.getSimpleIntAsPrimitive();
    }

    @Override
    public long getSimpleLong() {

        return sproc.getSimpleLong();
    }

    @Override
    public int getSimpleInt(final int i) {
        return sproc.getSimpleInt(i);
    }

    @Override
    public boolean getBoolean() {
        return sproc.getBoolean();
    }

    @Override
    public void setBoolean(final boolean bool) {
        sproc.setBoolean(bool);
    }

    @Override
    public void useEnumParam(final ExampleEnum param) {
        sproc.useEnumParam(param);
    }

    @Override
    public void useCharParam(final char c) {
        sproc.useCharParam(c);
    }

    @Override
    public void useDateParam(final Date d) {
        sproc.useDateParam(d);
    }

    @Override
    public void useDateParam2(final Date d) {
        sproc.useDateParam2(d);
    }

    @Override
    public void useIntegerListParam(final List<Integer> l) {
        sproc.useIntegerListParam(l);
    }

    @Override
    public void getSimpleIntVoid(final int i) {
        sproc.getSimpleIntVoid(i);
    }

    @Override
    public boolean login(final String userName, final String password) {
        return sproc.login(userName, password);
    }

    @Override
    public List<ExampleDomainObject> getResult() {
        return sproc.getResult();
    }

    @Override
    public ExampleDomainObject getSingleResult() {
        return sproc.getSingleResult();
    }

    @Override
    public Integer getBla() {
        return sproc.getBla();
    }

    @Override
    public int getShardIndex(final int shard) {
        return sproc.getShardIndex(shard);
    }

    @Override
    public List<String> collectDataFromAllShards(final String someParameter) {
        return sproc.collectDataFromAllShards(someParameter);
    }

    @Override
    public List<String> collectDataFromAllShardsParallel(final String someParameter) {
        return sproc.collectDataFromAllShardsParallel(someParameter);
    }

    @Override
    public List<Integer> getInts() {
        return sproc.getInts();
    }

    @Override
    public List<Long> getLongs() {
        return sproc.getLongs();
    }

    @Override
    public String createOrUpdateObject(final ExampleDomainObject object) {
        return sproc.createOrUpdateObject(object);
    }

    @Override
    public String createOrUpdateObjectWithRandomFields(final ExampleDomainObjectWithRandomFields object) {
        return sproc.createOrUpdateObjectWithRandomFields(object);
    }

    @Override
    public String createOrUpdateObjectWithEnum(final ExampleDomainObjectWithEnum object) {
        return sproc.createOrUpdateObjectWithEnum(object);
    }

    @Override
    public String createOrUpdateObjectWithDate(final ExampleDomainObjectWithDate object) {
        return sproc.createOrUpdateObjectWithDate(object);
    }

    @Override
    public String createOrUpdateMultipleObjects(final List<ExampleDomainObject> objects) {
        return sproc.createOrUpdateMultipleObjects(objects);
    }

    @Override
    public String createOrUpdateMultipleObjectsWithRandomFields(
            final List<ExampleDomainObjectWithRandomFields> object) {
        return sproc.createOrUpdateMultipleObjectsWithRandomFields(object);
    }

    @Override
    public String createOrUpdateMultipleObjectsWithRandomFieldsNoAnnotation(
            final List<ExampleDomainObjectWithRandomFields> object) {
        return sproc.createOrUpdateMultipleObjectsWithRandomFieldsNoAnnotation(object);
    }

    @Override
    public String createOrUpdateMultipleObjectsWithRandomFieldsNoAnnotationOverride(
            final List<ExampleDomainObjectWithRandomFieldsOverride> object) {
        return sproc.createOrUpdateMultipleObjectsWithRandomFieldsNoAnnotationOverride(object);
    }

    @Override
    public String createOrUpdateMultipleObjectsWithMap(final List<ExampleDomainObjectWithMap> objects) {
        return sproc.createOrUpdateMultipleObjectsWithMap(objects);
    }

    @Override
    public String createOrUpdateMultipleObjectsWithInnerObject(final List<ExampleDomainObjectWithInnerObject> objects) {
        return sproc.createOrUpdateMultipleObjectsWithInnerObject(objects);
    }

    @Override
    public void createOrUpdateMultipleObjectsWithMapVoid(final List<ExampleDomainObjectWithMap> objects) {
        sproc.createOrUpdateMultipleObjectsWithMapVoid(objects);
    }

    @Override
    public boolean reserveStock(final String sku) {
        return sproc.reserveStock(sku);
    }

    @Override
    public void createArticleSimple(final String sku) {
        sproc.createArticleSimple(sku);
    }

    @Override
    public AddressPojo createAddress(final AddressPojo a) {
        return sproc.createAddress(a);
    }

    @Override
    public AddressPojo getAddress(final AddressPojo a) {
        return sproc.getAddress(a);
    }

    @Override
    public AddressPojo getAddressSql(final AddressPojo a) {
        return sproc.getAddressSql(a);
    }

    @Override
    public Date getFixedTestDate() {
        return sproc.getFixedTestDate();
    }

    @Override
    public void testTimeoutSetTo3s(final int sleep) {
        sproc.testTimeoutSetTo3s(sleep);
    }

    @Override
    public void testTimeoutSetTo5s(final int sleep) {
        sproc.testTimeoutSetTo5s(sleep);
    }

    @Override
    public String showTimeout() {
        return sproc.showTimeout();
    }

    @Override
    public ExampleDomainObjectWithInnerObject getObjectWithNull() {
        return sproc.getObjectWithNull();
    }

    @Override
    public ExampleDomainObjectWithSimpleTransformer testSimpleTransformer(
            final ExampleDomainObjectWithSimpleTransformer exampleDomainObjectWithSimpleTransformer) {
        return sproc.testSimpleTransformer(exampleDomainObjectWithSimpleTransformer);
    }

    @Override
    public ExampleDomainObjectWithEnum getEntityWithEnum(final long id) {
        return sproc.getEntityWithEnum(id);
    }

    @Override
    public ExampleDomainObjectWithGlobalTransformer testGlobalTransformer(
            final ExampleDomainObjectWithGlobalTransformer exampleDomainObjectWithGlobalTransformer) {
        return sproc.testGlobalTransformer(exampleDomainObjectWithGlobalTransformer);
    }

    @Override
    public ExampleDomainObjectWithValidation testSprocCallWithoutValidation1(
            final ExampleDomainObjectWithValidation exampleDomainObjectWithValidation) {
        return sproc.testSprocCallWithoutValidation1(exampleDomainObjectWithValidation);
    }

    @Override
    public ExampleDomainObjectWithValidation testSprocCallWithoutValidation2(
            final ExampleDomainObjectWithValidation exampleDomainObjectWithValidation) {
        return sproc.testSprocCallWithoutValidation2(exampleDomainObjectWithValidation);
    }

    @Override
    public ExampleDomainObjectWithValidation testSprocCallWithValidation(
            final ExampleDomainObjectWithValidation exampleDomainObjectWithValidation) {
        return sproc.testSprocCallWithValidation(exampleDomainObjectWithValidation);
    }

    @Override
    public ExampleDomainObjectWithValidation testSprocCallWithValidationInvalidRet1(
            final ExampleDomainObjectWithValidation exampleDomainObjectWithValidation) {
        return sproc.testSprocCallWithValidationInvalidRet1(exampleDomainObjectWithValidation);
    }

    @Override
    public ExampleDomainObjectWithValidation testSprocCallWithValidationInvalidRet2(
            final ExampleDomainObjectWithValidation exampleDomainObjectWithValidation) {
        return sproc.testSprocCallWithValidationInvalidRet2(exampleDomainObjectWithValidation);
    }

    @Override
    public GlobalTransformedObject testGlobalTransformer2(final GlobalTransformedObject globalTransformedObject) {
        return sproc.testGlobalTransformer2(globalTransformedObject);
    }

    @Override
    public GlobalTransformedObject testGlobalTransformer3(final GlobalTransformedObject globalTransformedObject,
            final ExampleDomainObject object) {
        return sproc.testGlobalTransformer3(globalTransformedObject, object);
    }

    @Override
    public List<GlobalTransformedObject> testGlobalTransformer4(
            final List<GlobalTransformedObject> globalTransformedObjects, final ExampleDomainObject object) {
        return sproc.testGlobalTransformer4(globalTransformedObjects, object);
    }

    @Override
    public List<GlobalTransformedObject> testGlobalTransformer5(
            final Set<GlobalTransformedObject> globalTransformedObjects, final ExampleDomainObject object) {
        return sproc.testGlobalTransformer5(globalTransformedObjects, object);
    }

    @Override
    public DateTime testGlobalTransformer6(final DateTime dateTime) {
        return sproc.testGlobalTransformer6(dateTime);
    }

    @Override
    public List<Integer> getIntArray() {
        return sproc.getIntArray();
    }

    @Override
    public ExampleIntCollection getExampleIntCollectionArray() {
        return sproc.getExampleIntCollectionArray();
    }
}
