-- begin SAMPLE_FOO
create table SAMPLE_FOO (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MAIN_BAR_ID varchar(36),
    --
    primary key (ID)
)^
-- end SAMPLE_FOO
-- begin SAMPLE_BAR
create table SAMPLE_BAR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FOO_ID varchar(36),
    --
    primary key (ID)
)^
-- end SAMPLE_BAR
