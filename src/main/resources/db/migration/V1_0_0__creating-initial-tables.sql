create table category_section
(
    id    bigserial primary key,
    names jsonb not null
);


create table category
(
    id                  bigserial primary key,
    names               jsonb                                      not null,
    descriptions        jsonb                                      null,
    category_section_id bigserial references category_section (id) not null
);


