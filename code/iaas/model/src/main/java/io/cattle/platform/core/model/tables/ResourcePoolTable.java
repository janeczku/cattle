/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ResourcePoolTable extends org.jooq.impl.TableImpl<io.cattle.platform.core.model.tables.records.ResourcePoolRecord> {

	private static final long serialVersionUID = -364789645;

	/**
	 * The singleton instance of <code>cattle.resource_pool</code>
	 */
	public static final io.cattle.platform.core.model.tables.ResourcePoolTable RESOURCE_POOL = new io.cattle.platform.core.model.tables.ResourcePoolTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.cattle.platform.core.model.tables.records.ResourcePoolRecord> getRecordType() {
		return io.cattle.platform.core.model.tables.records.ResourcePoolRecord.class;
	}

	/**
	 * The column <code>cattle.resource_pool.id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ResourcePoolRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>cattle.resource_pool.name</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ResourcePoolRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.resource_pool.account_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ResourcePoolRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.resource_pool.kind</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ResourcePoolRecord, java.lang.String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>cattle.resource_pool.uuid</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ResourcePoolRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.resource_pool.description</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ResourcePoolRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>cattle.resource_pool.state</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ResourcePoolRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.resource_pool.created</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ResourcePoolRecord, java.util.Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.resource_pool.removed</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ResourcePoolRecord, java.util.Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.resource_pool.remove_time</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ResourcePoolRecord, java.util.Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.resource_pool.data</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ResourcePoolRecord, java.util.Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB.length(16777215).asConvertedDataType(new io.cattle.platform.db.jooq.converter.DataConverter()), this, "");

	/**
	 * The column <code>cattle.resource_pool.pool_type</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ResourcePoolRecord, java.lang.String> POOL_TYPE = createField("pool_type", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.resource_pool.pool_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ResourcePoolRecord, java.lang.Long> POOL_ID = createField("pool_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.resource_pool.item</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ResourcePoolRecord, java.lang.String> ITEM = createField("item", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.resource_pool.owner_type</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ResourcePoolRecord, java.lang.String> OWNER_TYPE = createField("owner_type", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.resource_pool.owner_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ResourcePoolRecord, java.lang.Long> OWNER_ID = createField("owner_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.resource_pool.qualifier</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ResourcePoolRecord, java.lang.String> QUALIFIER = createField("qualifier", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>cattle.resource_pool</code> table reference
	 */
	public ResourcePoolTable() {
		this("resource_pool", null);
	}

	/**
	 * Create an aliased <code>cattle.resource_pool</code> table reference
	 */
	public ResourcePoolTable(java.lang.String alias) {
		this(alias, io.cattle.platform.core.model.tables.ResourcePoolTable.RESOURCE_POOL);
	}

	private ResourcePoolTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.ResourcePoolRecord> aliased) {
		this(alias, aliased, null);
	}

	private ResourcePoolTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.ResourcePoolRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, io.cattle.platform.core.model.CattleTable.CATTLE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.cattle.platform.core.model.tables.records.ResourcePoolRecord, java.lang.Long> getIdentity() {
		return io.cattle.platform.core.model.Keys.IDENTITY_RESOURCE_POOL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.ResourcePoolRecord> getPrimaryKey() {
		return io.cattle.platform.core.model.Keys.KEY_RESOURCE_POOL_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.ResourcePoolRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.ResourcePoolRecord>>asList(io.cattle.platform.core.model.Keys.KEY_RESOURCE_POOL_PRIMARY, io.cattle.platform.core.model.Keys.KEY_RESOURCE_POOL_IDX_RESOURCE_POOL_UUID, io.cattle.platform.core.model.Keys.KEY_RESOURCE_POOL_IDX_POOL_ITEM2);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.ResourcePoolRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.ResourcePoolRecord, ?>>asList(io.cattle.platform.core.model.Keys.FK_RESOURCE_POOL__ACCOUNT_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.cattle.platform.core.model.tables.ResourcePoolTable as(java.lang.String alias) {
		return new io.cattle.platform.core.model.tables.ResourcePoolTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public io.cattle.platform.core.model.tables.ResourcePoolTable rename(java.lang.String name) {
		return new io.cattle.platform.core.model.tables.ResourcePoolTable(name, null);
	}
}
