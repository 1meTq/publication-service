insert into category_section (id, names)
values (1, '{"ru": "Бытовой ремонт", "kz": "Тұрмыстық жөндеу"}');

insert into category (id, names, descriptions, category_section_id)
values (1,'{"ru": "Газовщики", "kz": "Газ өндірушілер"}', null, 1);

insert into category (id, names, descriptions, category_section_id)
values (2,'{"ru": "Электрики", "kz": "Электриктер"}', null, 1);