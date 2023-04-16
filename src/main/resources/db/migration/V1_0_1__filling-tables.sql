insert into category_section (id, names)
values (1, '{"ru": "Бытовой ремонт", "kz": "Тұрмыстық жөндеу"}');

insert into category_section (id, names)
values (2, '{"ru": "Строительные работы", "kz": "Құрылыс жұмыстары"}');

insert into category (id, names, descriptions, category_section_id)
values (1,'{"ru": "Газовщики", "kz": "Газ өндірушілер"}', null, 1);

insert into category (id, names, descriptions, category_section_id)
values (2,'{"ru": "Электрики", "kz": "Электриктер"}', null, 1);

insert into category (id, names, descriptions, category_section_id)
values (3,'{"ru": "Построить дом", "kz": "Үй салу"}', null, 2);

insert into category (id, names, descriptions, category_section_id)
values (4,'{"ru": "Покраска забора", "kz": "Қоршауды бояу"}', null, 2);