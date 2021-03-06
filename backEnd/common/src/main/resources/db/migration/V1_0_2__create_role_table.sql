CREATE TABLE roles
(
    `id` varchar(255) not null,
    `name` varchar(255),
    `zh_name` varchar(255),
    `locked` tinyint(1),
    `created_at` datetime,
    `updated_at` datetime,
    `deleted_at` datetime,
    primary key (`id`),
    index deleted_at (`deleted_at`)
) COLLATE = 'utf8mb4_general_ci';

CREATE TABLE user_roles
(
    `id` varchar(255) not null,
    `user_id` varchar(255),
    `role_id` varchar(255),
    `created_at` datetime,
    `updated_at` datetime,
    `deleted_at` datetime,
    primary key (`id`),
    index user_id (`user_id`),
    index role_id (`role_id`),
    index deleted_at (`deleted_at`)
) COLLATE = 'utf8mb4_general_ci';