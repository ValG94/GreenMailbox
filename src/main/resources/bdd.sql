create table end_user
(
    id bigint not null
        constraint end_user_pkey
            primary key,
    mail varchar(255),
    name varchar(255),
    password varchar(255),
    profile_green varchar(255),
    user_choice_challenge_difficulty bigint,
    user_choice_frequency_challenge bigint,
    user_right varchar(255)
);

alter table end_user owner to postgres;

create table event
(
    id integer not null
        constraint event_pkey
            primary key,
    comment_event varchar(255),
    date_debut date,
    end_date date,
    event_name varchar(255)
);

alter table event owner to postgres;

create table challenge
(
    id bigint not null
        constraint challenge_pkey
            primary key,
    date_creation timestamp,
    description varchar(255),
    img_url varchar(255),
    level integer not null,
    like_challenge integer not null,
    name_challenge varchar(255),
    event_id integer
        constraint fkamrsu16rqvuwhp4ihfqsxv8bv
            references event
);

alter table challenge owner to postgres;

create table challenge_end_users
(
    challenge_id bigint not null
        constraint fk3k9s5psu86yrxfsrt6ypd9cs7
            references challenge,
    end_users_id bigint not null
        constraint fk9ii7ws7q1ej0vt7o878kargrc
            references end_user,
    constraint challenge_end_users_pkey
        primary key (challenge_id, end_users_id)
);

alter table challenge_end_users owner to postgres;

create table content_challenge
(
    id bigint not null
        constraint content_challenge_pkey
            primary key,
    answers varchar(255),
    questions varchar(255),
    challenge_id bigint
        constraint fkb3b6nhypxu1jsky4scxt3wr93
            references challenge
);

alter table content_challenge owner to postgres;

create table event_challenge_list
(
    event_id integer not null
        constraint fkky9a6tlmlaqdug3ie2jcpfq9j
            references event,
    challenge_list_id bigint not null
        constraint uk_m5v4h7m9eie9hku4c69qj0eaq
            unique
        constraint fka2yalvxfxe65k5j6srxjlmxaf
            references challenge
);

alter table event_challenge_list owner to postgres;

create table resource
(
    id bigserial not null
        constraint resource_pkey
            primary key,
    url_resource varchar(255) not null,
    like_resource integer,
    publication_date date,
    status_content_resource varchar(255),
    type_resource varchar(255),
    event_id integer
        constraint fkkrch4vbigbwk0exnmqnq6jgpj
            references event
);

alter table resource owner to postgres;

create table event_resource_list
(
    event_id integer not null
        constraint fkdbgorj2qjrjkcrtesx51r5ljw
            references event,
    resource_list_id integer not null
        constraint uk_rdeslif65gj711kku286w470n
            unique
        constraint fk682etbmrxjcwlxmixdlmgk9xn
            references resource
);

alter table event_resource_list owner to postgres;

create table user_challenge
(
    fk_user bigint not null
        constraint fk8tr291jti0vnlcgdo5rt8yery
            references end_user,
    fk_challenge bigint not null
        constraint fk68wokupb13dj1knk0tidmxm33
            references challenge,
    status varchar(255),
    constraint user_challenge_pkey
        primary key (fk_user, fk_challenge)
);

alter table user_challenge owner to postgres;

create table user_history
(
    id bigint not null
        constraint user_history_pkey
            primary key,
    score bigint,
    end_user_id bigint
        constraint fkb002glyufb2glrq2sjj2ylw09
            references end_user
);

alter table user_history owner to postgres;