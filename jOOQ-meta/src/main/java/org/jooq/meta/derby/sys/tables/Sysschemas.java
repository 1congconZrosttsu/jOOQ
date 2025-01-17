/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.derby.sys.tables;


import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.derby.sys.Keys;
import org.jooq.meta.derby.sys.Sys;
import org.jooq.meta.derby.sys.tables.Sysconstraints.SysconstraintsPath;
import org.jooq.meta.derby.sys.tables.Syssequences.SyssequencesPath;
import org.jooq.meta.derby.sys.tables.Systables.SystablesPath;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sysschemas extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>SYS.SYSSCHEMAS</code>
     */
    public static final Sysschemas SYSSCHEMAS = new Sysschemas();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>SYS.SYSSCHEMAS.SCHEMAID</code>.
     */
    public final TableField<Record, String> SCHEMAID = createField(DSL.name("SCHEMAID"), SQLDataType.CHAR(36).nullable(false), this, "");

    /**
     * The column <code>SYS.SYSSCHEMAS.SCHEMANAME</code>.
     */
    public final TableField<Record, String> SCHEMANAME = createField(DSL.name("SCHEMANAME"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>SYS.SYSSCHEMAS.AUTHORIZATIONID</code>.
     */
    public final TableField<Record, String> AUTHORIZATIONID = createField(DSL.name("AUTHORIZATIONID"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    private Sysschemas(Name alias, Table<Record> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Sysschemas(Name alias, Table<Record> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>SYS.SYSSCHEMAS</code> table reference
     */
    public Sysschemas(String alias) {
        this(DSL.name(alias), SYSSCHEMAS);
    }

    /**
     * Create an aliased <code>SYS.SYSSCHEMAS</code> table reference
     */
    public Sysschemas(Name alias) {
        this(alias, SYSSCHEMAS);
    }

    /**
     * Create a <code>SYS.SYSSCHEMAS</code> table reference
     */
    public Sysschemas() {
        this(DSL.name("SYSSCHEMAS"), null);
    }

    public <O extends Record> Sysschemas(Table<O> path, ForeignKey<O, Record> childPath, InverseForeignKey<O, Record> parentPath) {
        super(path, childPath, parentPath, SYSSCHEMAS);
    }

    public static class SysschemasPath extends Sysschemas implements Path<Record> {
        public <O extends Record> SysschemasPath(Table<O> path, ForeignKey<O, Record> childPath, InverseForeignKey<O, Record> parentPath) {
            super(path, childPath, parentPath);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Sys.SYS;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.SYNTHETIC_PK_SYSSCHEMAS;
    }

    private transient SysconstraintsPath _sysconstraints;

    /**
     * Get the implicit to-many join path to the <code>SYS.SYSCONSTRAINTS</code>
     * table
     */
    public SysconstraintsPath sysconstraints() {
        if (_sysconstraints == null)
            _sysconstraints = new SysconstraintsPath(this, null, Keys.SYNTHETIC_FK_SYSCONSTRAINTS__SYNTHETIC_PK_SYSSCHEMAS.getInverseKey());

        return _sysconstraints;
    }

    private transient SyssequencesPath _syssequences;

    /**
     * Get the implicit to-many join path to the <code>SYS.SYSSEQUENCES</code>
     * table
     */
    public SyssequencesPath syssequences() {
        if (_syssequences == null)
            _syssequences = new SyssequencesPath(this, null, Keys.SYNTHETIC_FK_SYSSEQUENCES__SYNTHETIC_PK_SYSSCHEMAS.getInverseKey());

        return _syssequences;
    }

    private transient SystablesPath _systables;

    /**
     * Get the implicit to-many join path to the <code>SYS.SYSTABLES</code>
     * table
     */
    public SystablesPath systables() {
        if (_systables == null)
            _systables = new SystablesPath(this, null, Keys.SYNTHETIC_FK_SYSTABLES__SYNTHETIC_PK_SYSSCHEMAS.getInverseKey());

        return _systables;
    }

    @Override
    public Sysschemas as(String alias) {
        return new Sysschemas(DSL.name(alias), this);
    }

    @Override
    public Sysschemas as(Name alias) {
        return new Sysschemas(alias, this);
    }

    @Override
    public Sysschemas as(Table<?> alias) {
        return new Sysschemas(alias.getQualifiedName(), this);
    }
}
