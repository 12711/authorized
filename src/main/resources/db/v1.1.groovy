package db
databaseChangeLog(logicalFilePath:'v1.1.groovy') {


    changeSet(author:'shaoming.lv@hand-china.com', id:'user001') {
        createTable(tableName: "user") {
            column(name: 'id', type: 'bigint(11)', remarks: '主键',autoIncrement: true) {
                constraints(primaryKey: true)
            }
            column(name: 'user_name', type: 'varchar(60)', remarks: '') {
                constraints(nullable: false)
            }
            column(name: 'password', type: 'varchar(60)', remarks: '') {
                constraints(nullable: false)
            }
            column(name: 'created_by',           type: 'varchar(60)',    remarks: '',defaultValue: "-1") {
            }
            column(name: 'creation_date',        type: 'datetime',       remarks: '',defaultValueComputed: "current_timestamp") {
            }
            column(name: 'last_updated_by',      type: 'varchar(60)',    remarks: '',defaultValue: "-1") {
            }
            column(name: 'last_update_date',     type: 'datetime',       remarks: '',defaultValueComputed: "current_timestamp") {
            }
            column(name: 'object_version_number',type: 'bigint(20)',     remarks: '',defaultValue: "-1") {
            }
        }
    }


    changeSet(author:'shaoming.lv@hand-china.com', id:'role001') {
        createTable(tableName: "role") {
            column(name: 'id', type: 'bigint(11)', remarks: '主键',autoIncrement: true) {
                constraints(primaryKey: true)
            }
            column(name: 'role_code', type: 'varchar(60)', remarks: '') {
                constraints(nullable: false)
            }
            column(name: 'role_name', type: 'varchar(60)', remarks: '') {
                constraints(nullable: false)
            }
            column(name: 'created_by',           type: 'varchar(60)',    remarks: '',defaultValue: "-1") {
            }
            column(name: 'creation_date',        type: 'datetime',       remarks: '',defaultValueComputed: "current_timestamp") {
            }
            column(name: 'last_updated_by',      type: 'varchar(60)',    remarks: '',defaultValue: "-1") {
            }
            column(name: 'last_update_date',     type: 'datetime',       remarks: '',defaultValueComputed: "current_timestamp") {
            }
            column(name: 'object_version_number',type: 'bigint(20)',     remarks: '',defaultValue: "-1") {
            }
        }
    }

    changeSet(author:'shaoming.lv@hand-china.com', id:'user_role_releation001') {
        createTable(tableName: "user_role_releation") {
            column(name: 'id', type: 'bigint(11)', remarks: '主键',autoIncrement: true) {
                constraints(primaryKey: true)
            }
            column(name: 'role_id', type: 'bigint(11)', remarks: '') {
                constraints(nullable: false)
            }
            column(name: 'user_id', type: 'bigint(11)', remarks: '') {
                constraints(nullable: false)
            }
            column(name: 'created_by',           type: 'varchar(60)',    remarks: '',defaultValue: "-1") {
            }
            column(name: 'creation_date',        type: 'datetime',       remarks: '',defaultValueComputed: "current_timestamp") {
            }
            column(name: 'last_updated_by',      type: 'varchar(60)',    remarks: '',defaultValue: "-1") {
            }
            column(name: 'last_update_date',     type: 'datetime',       remarks: '',defaultValueComputed: "current_timestamp") {
            }
            column(name: 'object_version_number',type: 'bigint(20)',     remarks: '',defaultValue: "-1") {
            }
        }
    }

    changeSet(author:'shaoming.lv@hand-china.com', id:'user_group001') {
        createTable(tableName: "user_group") {
            column(name: 'id', type: 'bigint(11)', remarks: '主键',autoIncrement: true) {
                constraints(primaryKey: true)
            }
            column(name: 'group_name', type: 'varchar(10)', remarks: '') {
                constraints(nullable: false)
            }
            column(name: 'created_by',           type: 'varchar(60)',    remarks: '',defaultValue: "-1") {
            }
            column(name: 'creation_date',        type: 'datetime',       remarks: '',defaultValueComputed: "current_timestamp") {
            }
            column(name: 'last_updated_by',      type: 'varchar(60)',    remarks: '',defaultValue: "-1") {
            }
            column(name: 'last_update_date',     type: 'datetime',       remarks: '',defaultValueComputed: "current_timestamp") {
            }
            column(name: 'object_version_number',type: 'bigint(20)',     remarks: '',defaultValue: "-1") {
            }
        }
    }

    changeSet(author:'shaoming.lv@hand-china.com', id:'role_group_releation001') {
        createTable(tableName: "role_group_releation") {
            column(name: 'id', type: 'bigint(11)', remarks: '主键',autoIncrement: true) {
                constraints(primaryKey: true)
            }
            column(name: 'role_id', type: 'bigint(11)', remarks: '') {
                constraints(nullable: false)
            }
            column(name: 'group_id', type: 'bigint(11)', remarks: '') {
                constraints(nullable: false)
            }
            column(name: 'created_by',           type: 'varchar(60)',    remarks: '',defaultValue: "-1") {
            }
            column(name: 'creation_date',        type: 'datetime',       remarks: '',defaultValueComputed: "current_timestamp") {
            }
            column(name: 'last_updated_by',      type: 'varchar(60)',    remarks: '',defaultValue: "-1") {
            }
            column(name: 'last_update_date',     type: 'datetime',       remarks: '',defaultValueComputed: "current_timestamp") {
            }
            column(name: 'object_version_number',type: 'bigint(20)',     remarks: '',defaultValue: "-1") {
            }
        }
    }

    changeSet(author:'shaoming.lv@hand-china.com', id:'menu001') {
        createTable(tableName: "menu") {
            column(name: 'id', type: 'bigint(11)', remarks: '主键',autoIncrement: true) {
                constraints(primaryKey: true)
            }
            column(name: 'menu_name', type: 'varchar(100)', remarks: '') {
                constraints(nullable: false)
            }
            column(name: 'path', type: 'varchar(120)', remarks: '') {
                constraints(nullable: false)
            }
            column(name: 'icon', type: 'varchar(120)', remarks: '主键') {
                constraints(primaryKey: true)
            }
            column(name: 'parent', type: 'bigint(11)', remarks: '') {
                constraints(nullable: false)
            }
            column(name: 'level', type: 'varchar(10)', remarks: '') {
                constraints(nullable: false)
            }
            column(name: 'created_by',           type: 'varchar(60)',    remarks: '',defaultValue: "-1") {
            }
            column(name: 'creation_date',        type: 'datetime',       remarks: '',defaultValueComputed: "current_timestamp") {
            }
            column(name: 'last_updated_by',      type: 'varchar(60)',    remarks: '',defaultValue: "-1") {
            }
            column(name: 'last_update_date',     type: 'datetime',       remarks: '',defaultValueComputed: "current_timestamp") {
            }
            column(name: 'object_version_number',type: 'bigint(20)',     remarks: '',defaultValue: "-1") {
            }
        }
    }

    changeSet(author:'shaoming.lv@hand-china.com', id:'role_menu_releation001') {
        createTable(tableName: "role_menu_releation") {
            column(name: 'id', type: 'bigint(11)', remarks: '主键',autoIncrement: true) {
                constraints(primaryKey: true)
            }
            column(name: 'menu_id', type: 'bigint(11)', remarks: '') {
                constraints(nullable: false)
            }
            column(name: 'role_id', type: 'bigint(11)', remarks: '') {
                constraints(nullable: false)
            }
            column(name: 'created_by',           type: 'varchar(60)',    remarks: '',defaultValue: "-1") {
            }
            column(name: 'creation_date',        type: 'datetime',       remarks: '',defaultValueComputed: "current_timestamp") {
            }
            column(name: 'last_updated_by',      type: 'varchar(60)',    remarks: '',defaultValue: "-1") {
            }
            column(name: 'last_update_date',     type: 'datetime',       remarks: '',defaultValueComputed: "current_timestamp") {
            }
            column(name: 'object_version_number',type: 'bigint(20)',     remarks: '',defaultValue: "-1") {
            }
        }
    }

    changeSet(author:'shaoming.lv@hand-china.com', id:'user_menu_releation001') {
        createTable(tableName: "user_menu_releation") {
            column(name: 'id', type: 'bigint(11)', remarks: '主键',autoIncrement: true) {
                constraints(primaryKey: true)
            }
            column(name: 'group_id', type: 'bigint(11)', remarks: '') {
                constraints(nullable: false)
            }
            column(name: 'user_id', type: 'bigint(11)', remarks: '') {
                constraints(nullable: false)
            }
            column(name: 'created_by',           type: 'varchar(60)',    remarks: '',defaultValue: "-1") {

            }
            column(name: 'creation_date',        type: 'datetime',       remarks: '',defaultValueComputed: "current_timestamp") {

            }
            column(name: 'last_updated_by',      type: 'varchar(60)',    remarks: '',defaultValue: "-1") {

            }
            column(name: 'last_update_date',     type: 'datetime',       remarks: '',defaultValueComputed: "current_timestamp") {

            }
            column(name: 'object_version_number',type: 'bigint(20)',     remarks: '',defaultValue: "-1") {

            }
        }
    }

    changeSet(author:'shaoming.lv@hand-china.com', id:'user_group_releation001') {
        createTable(tableName: "user_group_releation") {
            column(name: 'id', type: 'bigint(11)', remarks: '主键',autoIncrement: true) {
                constraints(primaryKey: true)
            }
            column(name: 'group_id', type: 'bigint(11)', remarks: '') {
                constraints(nullable: false)
            }
            column(name: 'user_id', type: 'bigint(11)', remarks: '') {
                constraints(nullable: false)
            }
            column(name: 'created_by',           type: 'varchar(60)',    remarks: '',defaultValue: "-1") {

            }
            column(name: 'creation_date',        type: 'datetime',       remarks: '',defaultValueComputed: "current_timestamp") {

            }
            column(name: 'last_updated_by',      type: 'varchar(60)',    remarks: '',defaultValue: "-1") {

            }
            column(name: 'last_update_date',     type: 'datetime',       remarks: '',defaultValueComputed: "current_timestamp") {

            }
            column(name: 'object_version_number',type: 'bigint(20)',     remarks: '',defaultValue: "-1") {

            }
        }
    }


    changeSet(author: "shaoming.lv@hand-china.com",id: "20190403"){
        addColumn(tableName: "user_group_releation"){

            column(name: "enabled", type: "int(1)",
                    remarks:'是否启用',afterColumn:"user_id"){
                constraints(nullable: true)
            }
        }

        addColumn(tableName: "user_menu_releation"){

            column(name: "enabled", type: "int(1)",
                    remarks:'是否启用',afterColumn:"user_id"){
                constraints(nullable: true)
            }
        }

        addColumn(tableName: "role_menu_releation"){

            column(name: "enabled", type: "int(1)",
                    remarks:'是否启用',afterColumn:"role_id"){
                constraints(nullable: true)
            }
        }

        addColumn(tableName: "menu"){

            column(name: "enabled", type: "int(1)",
                    remarks:'是否启用',afterColumn:"id"){
                constraints(nullable: true)
            }
        }

        addColumn(tableName: "role_group_releation"){

            column(name: "enabled", type: "int(1)",
                    remarks:'是否启用',afterColumn:"role_id"){
                constraints(nullable: true)
            }
        }

        addColumn(tableName: "user_group"){

            column(name: "enabled", type: "int(1)",
                    remarks:'是否启用',afterColumn:"id"){
                constraints(nullable: true)
            }
        }

        addColumn(tableName: "user_role_releation"){

            column(name: "enabled", type: "int(1)",
                    remarks:'是否启用',afterColumn:"user_id"){
                constraints(nullable: true)
            }
        }

        addColumn(tableName: "role"){

            column(name: "enabled", type: "int(1)",
                    remarks:'是否启用',afterColumn:"id"){
                constraints(nullable: true)
            }
        }

        addColumn(tableName: "user"){

            column(name: "enabled", type: "int(1)",
                    remarks:'是否启用',afterColumn:"id"){
                constraints(nullable: true)
            }
        }
    }


}