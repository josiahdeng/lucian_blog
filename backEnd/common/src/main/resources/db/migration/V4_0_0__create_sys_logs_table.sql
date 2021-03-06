create table sys_logs
(
    id              varchar(255) not null,
    user_id         varchar(255),
    operation       varchar(255),
    time            bigint,
    method          varchar(255),
    request_params  text,
    response_status integer,
    ip              varchar(255),
    address         varchar(255),
    browser         varchar(255),
    os              varchar(255),
    created_at      datetime,
    updated_at      datetime,
    deleted_at      datetime,
    primary key (id),
    index user_id(`user_id`),
    index deleted_at (`deleted_at`)
) collate utf8mb4_bin;