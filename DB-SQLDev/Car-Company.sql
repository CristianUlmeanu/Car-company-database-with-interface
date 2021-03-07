create table Masina
(Serie_Sasiu varchar(20) primary key,
Fabrica_ID integer,
Nume_model varchar(40) not null,
Data_productie date not null,
Motorizare number(3,1) not null,
Combustibil varchar(8) not null,
Tip_caroserie varchar(20) not null,
Tractiune varchar(20) not null
);

alter table Masina
add ( 
constraint fk_fabrica_id_1 foreign key (Fabrica_ID) references Fabrica(Fabrica_ID) on delete set null,
constraint fk_nume_model_id_1 foreign key (Nume_model) references Lista_modele(Nume_model),
constraint check_serie check(length(Serie_Sasiu)=17),
constraint check_motor check(regexp_like(Motorizare,'[1-9].[0-9]|0.[1-9]|[1-9]')),
constraint check_comb check(Combustibil in ('Diesel', 'Benzina')),
constraint check_caroserie check(Tip_caroserie in('Berlina', 'Break', 'Coupe', 'Cabriolet', 'Limuzina', 'Roadster', 'Pick-up', 'SUV', 'Sedan', 'Hatchback')),
constraint check_tractiune check(Tractiune in('Integrala', 'Fata', 'Spate'))
);

insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('WDDGF8AB6DA864147',0,'Megane','30JUL2008',1.9,'Diesel','Sedan','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('5N1AR18WX6C606949',null,'Megane','28 January 1996',1.4,'Benzina','Sedan','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('1D7HA18N54J156563',2,'Megane','7 February 2004',1.6,'Diesel','Hatchback','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('KNADM4A32F6464559',null,'Megane','30 October 1997',1.2,'Benzina','Sedan','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('1GNFLGEK2EZ128609',1,'Megane','28 November 2011',2.0,'Benzina','Hatchback','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('1GKS8CF47E1130389',2,'Megane','20 June 2004',1.6,'Diesel','Sedan','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('1HGCR2F34DA046576',0,'Megane','21 June 2004',1.9,'Diesel','Sedan','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('1GKET36M7A2212140',1,'Megane','7 February 2004',1.4,'Benzina','Hatchback','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('1GKFK668X8J227078',2,'Megane','20 January 2016',1.6,'Diesel','Sedan','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('1FTFW1EV6AKE23061',0,'Megane','16 August 2018',1.6,'Diesel','Sedan','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('5FNRL5H48DB031488',1,'Megane','7 December 2020',1.9,'Benzina','Hatchback','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('JHLRD788X2C093130',null,'Megane','19 May 1997',1.2,'Benzina','Sedan','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('KMHCN46C98U216288',0,'Megane','11 July 2010',1.6,'Diesel','Hatchback','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('1FMFU17537LA00083',1,'Megane','13 June 2007',1.6,'Benzina','Hatchback','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('WBAFR9C55CDV58965',2,'Megane','3 May 2013',1.4,'Benzina','Hatchback','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('4T1BK46K87U529908',null,'Megane','13 August 1996',1.0,'Benzina','Sedan','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('1GTV2UEC3EZ233027',0,'Megane','26JUL2008',1.9,'Diesel','Sedan','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('1C6RR7FT2DS651610',0,'Megane','31 August 2002',1.6,'Benzina','Hatchback','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('JN8AS5MT6BW134368',null,'Clio','29 August 1995',1.2,'Diesel','Hatchback','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('JN1CV6EK7AM103635',null,'Clio','15 March 1999',1.0,'Diesel','Hatchback','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('1FTRW07322KC98886',0,'Clio','13 December 2006',1.4,'Diesel','Hatchback','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('YV4BZ982381000392',1,'Clio','2 February 2007',1.6,'Benzina','Hatchback','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('3GTRKVE3XAG221829',2,'Clio','25 June 2007',1.4,'Diesel','Hatchback','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('1GTHK24U35E329596',1,'Clio','16 September 2013',1.6,'Benzina','Hatchback','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('2HGFB2F85CH510651',1,'Clio','30 March 2016',1.6,'Benzina','Hatchback','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('KNDJN2A26E7701772',0,'Clio','25 March 2020',1.4,'Diesel','Hatchback','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('5XXGN4A75DG140844',2,'Clio','12 October 2018',1.0,'Diesel','Hatchback','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('3C3CFFCR4CT104060',2,'Clio','4 June 2014',1.2,'Diesel','Hatchback','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('1FMHK7F8XCGA97606',2,'Clio','22 January 2015',1.4,'Benzina','Hatchback','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('1G3HC52K0X4812326',2,'Clio','9 June 2011',1.4,'Diesel','Break','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('2HGES25724H517479',2,'Clio','7 November 2013',1.6,'Diesel','Break','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('JTMBK4DV7A5086038',2,'Clio','21 November 2009',1.4,'Diesel','Break','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('NM0LS7BN5CT000892',0,'Clio','27 January 2010',1.6,'Benzina','Break','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('1FAFP406X4F223303',2,'Koleos','30JUL2019',2.0,'Diesel','SUV','Integrala');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('1G6DN56S750151145',2,'Koleos','14JUL2020',2.0,'Diesel','SUV','Integrala');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('1G1ND52F64M558404',2,'Kaptur','13Feb2020',1.3,'Benzina','SUV','Integrala');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('3TMLU4EN7CM097020',2,'Koleos','24 May 2019',1.7,'Diesel','SUV','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('1G1YY26E975185424',2,'Kaptur','08-Oct-2020',1.6,'Diesel','SUV','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('JNKDA31A93T115768',2,'Kadjar','22JUL2018',1.7,'Diesel','SUV','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('4S3BH686XY7622881',1,'Talisman','8 May 2020',2.0,'Diesel','Sedan','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('1FAHP3K21CL280289',1,'Talisman','10 June 2020',2.0,'Diesel','Sedan','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('3WKDDU9X57F155623',0,'Talisman','20 August 2020',1.7,'Diesel','Sedan','Fata');
insert into Masina
(Serie_Sasiu, Fabrica_ID, Nume_model, Data_productie, Motorizare, Combustibil, Tip_caroserie, Tractiune)
values
('3GNBACFU8BS660369',0,'Talisman','27 September 2020',1.3,'Benzina','Sedan','Fata');

CREATE TABLE Lista_modele
(Nume_model VARCHAR(40) primary key,
Data_aparitie DATE NOT NULL,
Generatii integer NOT NULL
);

alter table Lista_modele
add (
constraint check_generatii check(Generatii>0)
);

insert into Lista_modele
(Nume_model, Data_aparitie, Generatii)
values
('Clio','01SEP1990',5);
insert into Lista_modele
(Nume_model, Data_aparitie, Generatii)
values
('Megane','01SEP1995',4);
insert into Lista_modele
(Nume_model, Data_aparitie, Generatii)
values
('Kaptur','01-dec-2013',2);
insert into Lista_modele
(Nume_model, Data_aparitie, Generatii)
values
('Kadjar','01April2015',1);
insert into Lista_modele
(Nume_model, Data_aparitie, Generatii)
values
('Koleos','01Jan2008',4);
insert into Lista_modele
(Nume_model, Data_aparitie, Generatii)
values
('Talisman','6JUL2015',1);


create table Fabrica
(Fabrica_ID integer primary key,
Nume_companie varchar(40),
Dimensiune number(12,2) not null,
Putere_asamblare integer not null,
Lini_asamblare integer not null,
Numar_angajati integer not null
);

alter table Fabrica
add (
constraint fk_nume_companie_1 foreign key (Nume_companie) references Furnizor(Nume_companie) on delete set null,
constraint check_dim check(Dimensiune>2000),
constraint check_putere check(Putere_asamblare>500),
constraint check_lini check(Lini_asamblare>0),
constraint check_numar check(Numar_Angajati>50)
);

insert into Fabrica
(Fabrica_ID, Nume_companie, Dimensiune, Putere_asamblare, Lini_asamblare, Numar_angajati)
values
(0,NULL,2370000,120000,7,6000);
insert into Fabrica
(Fabrica_ID, Nume_companie, Dimensiune, Putere_asamblare, Lini_asamblare, Numar_angajati)
values
(1,'Eventuri',50000,10000,1,400);
insert into Fabrica
(Fabrica_ID, Nume_companie, Dimensiune, Putere_asamblare, Lini_asamblare, Numar_angajati)
values
(2,'Mercedes-Benz',1000000,70000,5,4500);


create table Locatie
(Locatie_ID integer primary key,
Fabrica_ID integer unique,
Showroom_ID integer unique,
Tara varchar(30) not null,
Stat varchar(30) not null,
Oras varchar(30) not null,
Strada varchar(40) not null,
Numar varchar(6) not null,
Cod_Postal varchar(10) not null
);

alter table Locatie
add(
constraint fk_fabrica_id_2 foreign key (Fabrica_ID) references Fabrica(Fabrica_ID) on delete cascade,
constraint fk_showroom_id_1 foreign key (Showroom_ID) references Showroom(Showroom_ID) on delete cascade,
constraint check_tip_locatie check((Fabrica_ID is null and Showroom_ID is not null)or(Fabrica_ID is not null and Showroom_ID is null)),
constraint unique_locatie unique(Tara, Stat, Oras, Strada),
constraint check_tara check(regexp_like(Tara,'[a-zA-Z]')),
constraint check_stat check(regexp_like(Stat,'[a-zA-Z]')),
constraint check_oras check(regexp_like(Oras,'[a-zA-Z]')),
constraint check_numar_strada check(regexp_like(Numar,'[0-9]|[0-9][a-zA-Z]')));

insert into Locatie
(Locatie_ID, Fabrica_ID, Showroom_ID, Tara, Stat, Oras, Strada, Numar, Cod_Postal)
values
(0,0,NULL,'Franta','Ile de France','Aubergenville','Boulevard Pierre Lefaucheux','203BP','78410');
insert into Locatie
(Locatie_ID, Fabrica_ID, Showroom_ID, Tara, Stat, Oras, Strada, Numar, Cod_Postal)
values
(1,1,NULL,'Romania','Constanta','Ovidiu','Delfinului','13A','905900');
insert into Locatie
(Locatie_ID, Fabrica_ID, Showroom_ID, Tara, Stat, Oras, Strada, Numar, Cod_Postal)
values
(2,2,NULL,'Romania','Constanta','Constanta','Ion Luca Caragiale','8','900211');
insert into Locatie
(Locatie_ID, Fabrica_ID, Showroom_ID, Tara, Stat, Oras, Strada, Numar, Cod_Postal)
values
(3,null,0,'Romania','Constanta','Constanta','Eremia Movila','10A','900604');
insert into Locatie
(Locatie_ID, Fabrica_ID, Showroom_ID, Tara, Stat, Oras, Strada, Numar, Cod_Postal)
values
(4,null,1,'Romania','Ploiesti','Ploiesti','Maramures','12','100029');
insert into Locatie
(Locatie_ID, Fabrica_ID, Showroom_ID, Tara, Stat, Oras, Strada, Numar, Cod_Postal)
values
(5,null,2,'Romania','Iasi','Iasi','Oancea','36','700350');
insert into Locatie
(Locatie_ID, Fabrica_ID, Showroom_ID, Tara, Stat, Oras, Strada, Numar, Cod_Postal)
values
(6,null,3,'Romania','Bucuresti','Bucuresti','Progresului','90 100','050696');
insert into Locatie
(Locatie_ID, Fabrica_ID, Showroom_ID, Tara, Stat, Oras, Strada, Numar, Cod_Postal)
values
(7,null,4,'Romania','Prahova','Mizil','Soseaua Mihai Bravu','59','105800');
insert into Locatie
(Locatie_ID, Fabrica_ID, Showroom_ID, Tara, Stat, Oras, Strada, Numar, Cod_Postal)
values
(8,null,5,'Romania','Cluj Napoca','Cluj','Bulevardul 21 Decembrie 1989','118','400604');
insert into Locatie
(Locatie_ID, Fabrica_ID, Showroom_ID, Tara, Stat, Oras, Strada, Numar, Cod_Postal)
values
(9,null,6,'Romania','Bucuresti','Bucuresti','Cetatea Histria','12','062079');
insert into Locatie
(Locatie_ID, Fabrica_ID, Showroom_ID, Tara, Stat, Oras, Strada, Numar, Cod_Postal)
values
(10,null,7,'Romania','Prahova','Campina','1 Decembrie 1918','12','105600');
insert into Locatie
(Locatie_ID, Fabrica_ID, Showroom_ID, Tara, Stat, Oras, Strada, Numar, Cod_Postal)
values
(11,null,8,'Romania','Suceava','Suceava','Tipografiei','1','720043');
insert into Locatie
(Locatie_ID, Fabrica_ID, Showroom_ID, Tara, Stat, Oras, Strada, Numar, Cod_Postal)
values
(12,null,9,'Romania','Tulcea','Babadac','Pacii','1','825100');
insert into Locatie
(Locatie_ID, Fabrica_ID, Showroom_ID, Tara, Stat, Oras, Strada, Numar, Cod_Postal)
values
(13,null,10,'Romania','Oradea','Bihor','Madach Imre','1','410021');

create table Furnizor
(Nume_companie varchar(40) primary key,
Nume_contact varchar(20) not null,
Prenume_contact varchar(20) not null,
Telefon_contact varchar(10) not null unique,
Email_contact varchar(40) not null unique
);

alter table Furnizor
add(
constraint check_nume_contact check(regexp_like(Nume_contact,'[a-zA-Z]')),
constraint check_prenume_contact check(regexp_like(Prenume_contact,'[a-zA-Z]')),
constraint check_tel_contact check((length(Telefon_contact)=10)and (regexp_like(Telefon_contact,'[0-9]'))),
constraint check_email_contact check(regexp_like(Email_contact,'[[:alnum:]]+@[[:alnum:]]+\.[[:alnum:]]'))
);

insert into Furnizor
(Nume_companie, Nume_contact, Prenume_contact, Telefon_contact, Email_contact)
values
('Michelin','Kalem','Curry','0800896551','viwodav672@nenekbet.com');
insert into Furnizor
(Nume_companie, Nume_contact, Prenume_contact, Telefon_contact, Email_contact)
values
('Mercedes-Benz','Emily','Hudson','0757440393','pisoba7754@nowdigit.com');
insert into Furnizor
(Nume_companie, Nume_contact, Prenume_contact, Telefon_contact, Email_contact)
values
('ETD','Kamile','Mustafa','0700626506','viwod@nenekbet.com');
insert into Furnizor
(Nume_companie, Nume_contact, Prenume_contact, Telefon_contact, Email_contact)
values
('Eventuri','Chyna','Mata','0774267065','dicohik685@nowdigit.com');
insert into Furnizor
(Nume_companie, Nume_contact, Prenume_contact, Telefon_contact, Email_contact)
values
('Akrapovic','Belinda','Mercado','0735617228','jakexo8646@nenekbet.com');
insert into Furnizor
(Nume_companie, Nume_contact, Prenume_contact, Telefon_contact, Email_contact)
values
('Slicks','Johanna','Wall','0793603633','gabajey559@nowdigit.com');
insert into Furnizor
(Nume_companie, Nume_contact, Prenume_contact, Telefon_contact, Email_contact)
values
('Body Work Constanta','Cassia','Sheldon','0760776257','rihopim225@mmgaklan.com');
insert into Furnizor
(Nume_companie, Nume_contact, Prenume_contact, Telefon_contact, Email_contact)
values
('Conex Distribution','Indigo','Glover','0789177569','dacarat491@nenekbet.com');
insert into Furnizor
(Nume_companie, Nume_contact, Prenume_contact, Telefon_contact, Email_contact)
values
('RaceBox','Alba','Alin','0752701114','yakave1338@kakekbet.com');
insert into Furnizor
(Nume_companie, Nume_contact, Prenume_contact, Telefon_contact, Email_contact)
values
('DOP Motorsport','Roosevelt','Townsend','0798073042','sifap92670@kakekbet.com');


create table Piesa
(Piesa_ID integer primary key,
Nume_companie varchar(40) not null,
Tip_piesa varchar(50) not null,
Garantie integer,
Pret number(8,2) not null
);

alter table Piesa
add(
constraint fk_nume_companie_2 foreign key (Nume_companie) references Furnizor(Nume_companie) on delete cascade,
constraint check_pret check(Pret>0),
constraint check_garantie check(Garantie>0 or Garantie=null)
);

insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(0,'RaceBox','ECU Raliu',1,100);
insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(1,'RaceBox','Evacuare Sport',5,2000.50);
insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(2,'RaceBox','Evacuare Sport',5,2000.50);
insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(3,'RaceBox','Pedal Box',3,500);
insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(4,'Michelin','Cauciucuri Alpin 6',2,350);
insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(5,'Michelin','Cauciucuri Pilot Alpin 5',2,516);
insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(6,'Michelin','Cauciucuri CrossClimate',2,847);
insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(7,'Michelin','Cauciucuri Energy Saver',2,368);
insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(8,'Michelin','Cauciucuri Pilot Sport Cup 2R',4,2666);
insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(9,'Michelin','Cauciucuri Primacy 4',1,310);
insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(10,'Michelin','Cauciucuri PILOT SUPER SPORT',2,611);
insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(11,'Mercedes-Benz','Motoare Aspirate',15,10000);
insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(12,'Mercedes-Benz','Cutie de viteza DCT',15,5000);
insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(13,'Eventuri','Intercooler Sport',5,4000);
insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(14,'Eventuri','Turbina 56mm',10,20000);
insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(15,'Eventuri','Admisie',10,20000);
insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(16,'Akrapovic','Sistem Evacuare Titanium',10,2000);
insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(17,'Akrapovic','Downpipe',5,500);
insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(18,'Akrapovic','Arcuri',3,500);
insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(19,'Akrapovic','Suspensie pe Perna de Aer',10,3000);
insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(20,'Slicks','Cauciucuri P Zero',2,400);
insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(21,'Slicks','Cauciucuri Proxes R888R',4,1000);
insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(22,'Slicks','Cauciucuri VanContact',NULL,200);
insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(23,'Slicks','Cauciucuri VikingContact',NULL,300);
insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(24,'ETD','Kit Frane Ceramice',5,4000);
insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(25,'Body Work Constanta','WideBody Kit',1,15000);
insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(26,'Body Work Constanta','Spoiler',1,570);
insert into Piesa
(Piesa_ID, Nume_companie, Tip_piesa, Garantie, Pret)
values
(27,'Body Work Constanta','Jante TE37',4,3000);


create table Showroom
(Showroom_ID integer primary key,
Fabrica_ID integer not null,
Nume_model varchar(40) not null,
Target_vanzari number(12,2) not null,
Incepere_program varchar(5) not null,
Sfarsit_program varchar(5) not null
);

alter table Showroom
add(
constraint fk_fabrica_id_3 foreign key (Fabrica_ID) references Fabrica(Fabrica_ID)on delete set null,
constraint fk_nume_model_id_2 foreign key (Nume_model) references Lista_modele(Nume_model),
constraint check_target check(Target_vanzari>0),
constraint check_incepere check(regexp_like(Incepere_Program,'([0-1][0-9]|2[0-3]):[0-5][0-9]')),
constraint check_sfarsit check(regexp_like(Sfarsit_Program,'([0-1][0-9]|2[0-3]):[0-5][0-9]'))
);

insert into Showroom
(Showroom_ID, Fabrica_ID, Nume_model, Target_vanzari, Incepere_program , Sfarsit_program)
values
(0,0,'Megane',100000,'08:30','20:00');
insert into Showroom
(Showroom_ID, Fabrica_ID, Nume_model, Target_vanzari, Incepere_program , Sfarsit_program)
values
(1,0,'Clio',50000.5,'10:00','22:00');
insert into Showroom
(Showroom_ID, Fabrica_ID, Nume_model, Target_vanzari, Incepere_program , Sfarsit_program)
values
(2,1,'Megane',135000,'08:00','21:00');
insert into Showroom
(Showroom_ID, Fabrica_ID, Nume_model, Target_vanzari, Incepere_program , Sfarsit_program)
values
(3,2,'Koleos',200000,'08:00','16:00');
insert into Showroom
(Showroom_ID, Fabrica_ID, Nume_model, Target_vanzari, Incepere_program , Sfarsit_program)
values
(4,2,'Kadjar',75000,'09:00','18:00');
insert into Showroom
(Showroom_ID, Fabrica_ID, Nume_model, Target_vanzari, Incepere_program , Sfarsit_program)
values
(5,0,'Talisman',277000,'12:00','23:00');
insert into Showroom
(Showroom_ID, Fabrica_ID, Nume_model, Target_vanzari, Incepere_program , Sfarsit_program)
values
(6,2,'Kaptur',150230.50,'08:30','16:30');
insert into Showroom
(Showroom_ID, Fabrica_ID, Nume_model, Target_vanzari, Incepere_program , Sfarsit_program)
values
(7,1,'Clio',20000,'08:00','16:00');
insert into Showroom
(Showroom_ID, Fabrica_ID, Nume_model, Target_vanzari, Incepere_program , Sfarsit_program)
values
(8,2,'Megane',50000,'09:00','17:00');
insert into Showroom
(Showroom_ID, Fabrica_ID, Nume_model, Target_vanzari, Incepere_program , Sfarsit_program)
values
(9,2,'Clio',30005,'10:00','18:00');
insert into Showroom
(Showroom_ID, Fabrica_ID, Nume_model, Target_vanzari, Incepere_program , Sfarsit_program)
values
(10,1,'Megane',98000,'10:30','17:30');

create table Angajat
(Angajat_ID integer primary key,
Fabrica_ID integer,
Nume varchar(40) not null,
Prenume varchar(40) not null,
Pozitie varchar(40) not null,
Salariu number(10,2) not null,
Data_angajare date not null
);

alter table Angajat
add(
constraint fk_fabrica_id_4 foreign key (Fabrica_ID) references Fabrica(Fabrica_ID) on delete cascade,
constraint check_nume_ang check(regexp_like(Nume,'[a-zA-Z]')),
constraint check_prenume_ang check(regexp_like(Prenume,'[a-zA-Z]')),
constraint check_pozitie check(regexp_like(Pozitie,'[a-zA-Z]')),
constraint check_salariu check(Salariu>0)
);

insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(0,null,'Luca','de Meo','CEO',202005,'01-jul-2020');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(1,null,'Avni','Klein','COO',175000,'5 February 1982');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(2,null,'Arabella','Vu','CFO',150000,'26 February 1986');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(3,null,'Eilish','Bravo','CMO',145000,'12 February 1988');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(4,null,'Everly','Bourne','CTO',120000,'12 October 1994');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(5,null,'Juniper','Brett','Asistent Executiv',100000,'16 April 1995');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(6,null,'Lance','Harding','Manager Marketing',110000,'20 September 1996');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(7,null,'Latoya','Mccall','Manager Produse',95000,'17 March 2000');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(8,null,'Ottilie','Redmond','Manager Proiecte',92000,'25 June 2001');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(9,null,'Jerry','Joseph','Manager Finante',89000,'30 October 2002');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(10,null,'Rees','Gomez','Manager Resurse Umane',80000,'10 February 2005');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(11,1,'Mandeep','Kavanagh','Manager Resurse Umane',50000,'3 November 2005');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(12,0,'Kelise','Harper','Manager Resurse Umane',60000,'6 March 2007');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(13,2,'Seamus','Donovan','Manager Resurse Umane',55000,'9 August 2009');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(14,0,'Jorja','Archer','Asistent Executiv',45000,'2 October 2010');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(15,0,'Kaylan','Pitt','Manager Marketing',60000,'24 December 2010');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(16,0,'Victor','Kaufman','Manager Produse',40000,'24 December 2011');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(17,0,'Mekhi','Cruz','Manager Proiecte',40000,'1 February 2013');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(18,0,'Denise','Payne','Manager Finante',50000,'8 November 2015');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(19,1,'Amy Leigh','Robin','Asistent Executiv',50000,'24 July 2017');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(20,1,'Roseanna','Drummond','Manager Marketing',45000,'16 March 2018');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(21,1,'Aanya','Montgomery','Manager Produse',39000,'27 March 2018');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(22,1,'Aditya','Barber','Manager Proiecte',40000,'28 March 2018');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(23,1,'Ruby May','Fletcher','Manager Finante',50000,'6 October 2018');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(24,2,'Rosemary','Rahman','Asistent Executiv',45000,'18 December 2018');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(25,2,'Rupert','Mcdonnell','Manager Marketing',47000,'27 September 1994');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(26,2,'Keeley','Howells','Manager Produse',53500,'3 June 1983');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(27,2,'Danial','Simon','Manager Proiecte',59450,'25 April 1987');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(28,2,'Kenan','Naylor','Manager Finante',47000,'9 May 1988');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(29,0,'Kourtney','Robson','Contabil',20000,'20 June 1989');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(30,0,'Axl','Jackson','Contabil',10000,'27 May 1991');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(31,1,'Freya','Grimes','Contabil',20000,'13 June 1993');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(32,2,'Patryk','French','Contabil',20000,'5 March 1995');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(33,2,'Awais','Sandoval','Contabil',10000,'27 September 1994');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(34,0,'Austen','Kearns','Contabil',10450,'13 September 2001');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(35,0,'Jedd','O Sullivan','Reprezentant relatii cu clientii',10000,'9 July 2002');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(36,1,'Tonicha','Iles','Reprezentant relatii cu clientii',9500,'1 February 2004');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(37,2,'Ayomide','Thorpe','Reprezentant relatii cu clientii',8000,'31 March 2006');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(38,0,'Archibald','Le','Inginer auto',8000,'8 February 2007');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(39,0,'Saffron','Bishop','Inginer auto',7450,'2 March 2007');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(40,0,'Daniele','Dougherty','Inginer auto',6000,'24 July 2008');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(41,0,'Lani','Neal','Inginer auto',6855,'15 December 2008');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(42,0,'George','Kemp','Inginer auto',8000,'18 January 2011');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(43,0,'Chiara','Powers','Inginer auto',6000,'2 December 2012');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(44,0,'Emanuel','James','Inginer auto',7450,'23 September 2016');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(45,0,'Sidrah','Romero','Inginer auto',7300,'23 June 2017');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(46,0,'Elisa','Bowden','Inginer auto',7300,'21 April 2019');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(47,0,'Margaux','Rodgers','Inginer auto',6000,'28 September 2019');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(48,0,'Della','Bone','Inginer auto',7650,'15 January 2001');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(49,0,'Rea','Coffey','Inginer auto',7450,'15 January 2001');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(50,0,'Atticus','Crossley','Inginer auto',6000,'15 January 2001');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(51,0,'Claudia','Jacobs','Inginer auto',7500,'28 May 2001');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(52,0,'Jett','O Gallagher','Inginer auto',8000,'16 June 2001');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(53,0,'Kamil','Livingston','Inginer auto',7650,'23 February 2002');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(54,0,'RubyLeigh', 'Pierce','Inginer auto',7200,'29 April 2002');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(55,0,'Muhammad','Wainwright','Inginer auto',7450,'5 August 2003');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(56,0,'Simona','Villegas','Inginer auto',6855,'15 March 2005');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(57,0,'Sherri','Duncan','Inginer auto',6855,'6 February 2006');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(58,1,'Johnny','Dawe','Inginer auto',8000,'21 January 2007');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(59,1,'Suleman','Keenan','Inginer auto',6000,'26 October 2009');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(60,1,'Kenneth','Chester','Inginer auto',6000,'5 May 2015');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(61,1,'Jareth','Haney','Inginer auto',8000,'28 June 2015');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(62,1,'Lulu','Chadwick','Inginer auto',6200,'25 December 2015');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(63,1,'Meghan','Anderson','Inginer auto',7450,'20 February 2020');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(64,1,'Taryn','Scott','Inginer auto',7750,'11 June 1999');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(65,1,'Lorena','Lara','Inginer auto',7600,'29 February 2000');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(66,1,'Angela','Sykes','Inginer auto',7450,'28 November 2004');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(67,2,'Dianne ','Branch','Inginer auto',6300,'28 November 2005');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(68,2,'Harriet','Allan','Inginer auto',6590,'21 November 2008');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(69,2,'Tamar','Brennan','Inginer auto',6300,'17 March 2009');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(70,2,'Sahara','Sanderson','Inginer auto',7300,'29 May 2009');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(71,2,'Bret','Mcclain','Inginer auto',8000,'15 October 2009');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(72,2,'Devonte','Derrick','Inginer auto',6900,'11 July 2012');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(73,2,'Ianis','Crane','Inginer auto',6900,'30 August 2012');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(74,2,'Leroy','Rowley','Inginer auto',6800,'2 July 2014');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(75,2,'Ailsa','Stamp','Inginer auto',6590,'16 September 2015');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(76,2,'Chanel','Copeland','Inginer auto',6000,'1 February 2017');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(77,2,'Jenny','Mckee','Inginer auto',6400,'1 February 2017');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(78,2,'Nicolle','Chung','Inginer auto',8000,'21 October 2017');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(79,2,'Brandon','Kumar','Inginer auto',6000,'18 May 2018');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(80,0,'Rojin','Gray','Vopsitor',3000,'10 October 2020');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(81,0,'Isobella','Taylor','Vopsitor',3000,'10 October 2020');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(82,0,'Colm','Mcneill','Vopsitor',3300,'15 April 2020');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(83,0,'Livia','O Reilly','Vopsitor',4000,'13 July 2017');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(84,0,'Darcey','Butler','Vopsitor',4100,'13 January 2016');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(85,0,'Glen','Hirst','Vopsitor',4500,'11 August 2014');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(86,0,'Bayley','Blackmore','Vopsitor',4600,'1 October 2009');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(87,0,'Clarence','Walmsley','Vopsitor',5000,'16 February 2006');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(88,0,'Marion','Esparza','Vopsitor',4900,'13 March 2005');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(89,0,'Isadora','Kirk','Vopsitor',5350,'23 January 1996');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(90,1,'Ariana','Hunt','Vopsitor',5400,'11 January 1993');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(91,1,'Rita','Brookes','Vopsitor',5270,'11 June 1997');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(92,1,'Eben','Mair','Vopsitor',4950,'5 October 2001');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(93,2,'Lilah','Dodd','Vopsitor',5400,'20 April 1991');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(94,2,'Ruari','Fitzgerald','Vopsitor',5860,'26 October 1990');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(95,2,'Zakariya','Bowler','Vopsitor',6000,'5 July 1987');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(96,2,'Isla Grace','Franks','Vopsitor',5475,'30 June 1991');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(97,2,'Elise','Peralta','Vopsitor',5400,'6 May 1992');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(98,2,'Aleksandra','Phan','Vopsitor',5000,'6 September 1996');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(99,2,'Shanay','Devlin','Vopsitor',5100,'29 November 1996');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(100,0,'Jaimee','Alvarado','Mecanic',6500,'23 January 1997');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(101,0,'Charley','Pena','Mecanic',6444,'10 January 1998');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(102,0,'Mehak','House','Mecanic',6000,'6 January 1999');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(103,0,'Barney','Maxwell','Mecanic',5405,'23 August 2004');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(104,0,'Anja','Banks','Mecanic',5200,'24 March 2009');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(105,0,'Thierry','Wills','Mecanic',5430,'28 June 2006');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(106,0,'Madiha','Vazquez','Mecanic',5000,'1 March 2012');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(107,0,'Osama','Connelly','Mecanic',4900,'19 April 2015');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(108,0,'Boris','Ruiz','Mecanic',5000,'19 April 2015');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(109,0,'Abigayle','Spencer','Mecanic',5750,'29 May 2003');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(110,0,'Diesel','Mcdaniel','Mecanic',7000,'24 February 1985');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(111,0,'Ted','Solis','Mecanic',7000,'27 April 1984');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(112,0,'Star','Farrell','Mecanic',6996,'25 August 1987');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(113,0,'Briana','Dunkley','Mecanic',6900,'16 March 1991');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(114,0,'Marcos','Velazquez','Mecanic',6850,'30 June 1993');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(115,0,'Amrit','Stewart','Mecanic',6500,'17 December 1996');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(116,0,'Colm','Mcnally','Mecanic',6500,'24 July 1998');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(117,0,'Orlando','Cantu','Mecanic',5875,'8 March 2006');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(118,0,'Felicity','Hurley','Mecanic',5875,'7 June 2006');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(119,0,'Igor','Huang','Mecanic',5875,'8 August 2006');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(120,1,'Ada','Talley','Mecanic',5800,'28 April 2008');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(121,1,'Shayla','Watkins','Mecanic',4650,'23 March 2018');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(122,1,'Daryl','Walsh','Mecanic',6980,'16 June 1989');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(123,1,'Korben','Ventura','Mecanic',7500,'10 March 1982');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(124,1,'Claire','Clemons','Mecanic',7300,'29 November 1981');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(125,1,'Leonard','Wainwright','Mecanic',6750,'5 August 1998');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(126,1,'Raymond','Dickson','Mecanic',5525,'22 March 2008');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(127,1,'Uma','Calvert','Mecanic',5700,'11 December 2009');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(128,2,'Kendall','Hull','Mecanic',5300,'21 November 2012');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(129,2,'August','Case','Mecanic',4750,'7 September 2018');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(130,2,'Stan','Kavanagh','Mecanic',6853,'17 September 1989');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(131,2,'Skyla','Wilson','Mecanic',6714,'18 August 1988');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(132,2,'Abdulrahman','Arellano','Mecanic',6899,'26 September 1985');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(133,2,'Rebeca','Ramsey','Mecanic',5999,'17 February 1996');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(134,2,'Md','Castro','Mecanic',6000,'17 February 2001');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(135,2,'Dillon','Hanna','Mecanic',6000,'31 January 2005');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(136,2,'Macauley','Preston','Mecanic',5800,'11 December 2007');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(137,2,'Jaime','Johnson','Mecanic',5320,'24 November 2011');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(138,2,'Malak','Russo','Mecanic',5790,'3 August 2001');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(139,2,'Emrys','England','Mecanic',3700,'19 January 2005');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(140,0,'Tahmina','Underwood','Programator',4200,'13 April 2014');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(141,0,'Camron','Ramsay','Programator',3890,'24 June 2017');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(142,0,'Saif','Hackett','Programator',5000,'31 December 2001');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(143,0,'Candice','Bass','Programator',2500,'2 November 2020');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(144,0,'Essa','Robson','Programator',2500,'29 May 2020');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(145,1,'Dane','Lott','Programator',2500,'10 May 2020');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(146,1,'Saim','Page','Programator',3205,'22 February 2006');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(147,2,'Elaine','Clarkson','Programator',2950,'4 April 2002');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(148,2,'Belle','Obrien','Programator',3100,'30 September 2009');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(149,2,'Adrienne','Samuels','Programator',2100,'16 August 2018');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(150,2,'Lilah','Dodd','Programator',1700,'14 October 2020');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(151,0,'Barney','Maxwell','Tester Auto',4200,'16 October 1986');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(152,0,'Heidi','Moyer','Tester Auto',3800,'4 July 1995');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(153,0,'Emelia','Valentine','Tester Auto',3000,'27 November 2006');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(154,0,'Larissa','Price','Tester Auto',2400,'29 March 2011');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(155,0,'Vin','Diesel','Tester Auto',2100,'5 July 2014');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(156,0,'Necula','Alex','Tester Auto',2400,'11 July 2015');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(157,0,'Mocanu','Cosmin','Tester Auto',2000,'21 January 2019');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(158,0,'Grigore','Paul Bogdan','Tester Auto',1700,'12 May 2020');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(159,0,'Matei','Anca','Tester Auto',3100,'12 December 2000');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(160,0,'Pacuraru','Fabian','Tester Auto',2800,'2 December 2009');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(161,1,'Nastase','Andrei','Tester Auto',3710,'2 March 1990');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(162,1,'Nastase','Damian','Tester Auto',3105,'20 March 1995');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(163,1,'Matei','Dodo','Tester Auto',2000,'21 September 2017');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(164,1,'Ulmeanu','Cristian','Tester Auto',2500,'1 November 2013');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(165,2,'Nicoi','Alexandru','Tester Auto',4000,'1 February 1986');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(166,2,'Dyar','Mert','Tester Auto',3710,'12 August 1990');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(167,2,'Duta','Andrei','Tester Auto',3200,'19 September 2000');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(168,2,'Ogrjini','Petru','Tester Auto',2500,'22 March 2012');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(169,2,'Lupsea','Alin','Tester Auto',2350,'14 September 2016');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(170,2,'Necula','Matei','Tester Auto',2000,'25 October 2018');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(171,2,'Grecu','Razvan','Tester Auto',1750,'17 November 2020');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(172,0,'Echim','Radu','Asamblor',4000,'2 September 1994');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(173,0,'Dragomir','Radu','Asamblor',3650,'23 July 2004');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(174,0,'Inchimescu','Valentin','Asamblor',2400,'1 July 2012');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(175,0,'Motanu','Rey','Asamblor',2980,'17 January 2013');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(176,0,'Dumitrache','Florentin','Asamblor',2505,'7 March 2017');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(177,0,'Toader','Andrei','Asamblor',4050,'12 June 1993');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(178,2,'Mereu','Alexandra','Asamblor',3800,'30 January 2002');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(179,2,'Necula','David','Asamblor',3000,'18 March 2013');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(180,2,'Rusu','Edi','Asamblor',4400,'20 March 1991');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(181,2,'Logan','Paul','Asamblor',2399,'28 May 2009');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(182,2,'Logan','Jake','Asamblor',2640,'27 February 2016');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(183,2,'Ursu','Vlad','Asamblor',2500,'8 March 2017');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(184,1,'Ursu','Mircea','Asamblor',2500,'15 July 2017');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(185,1,'Chirica','Alexandra','Asamblor',4200,'18 December 1991');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(186,1,'Madelyn','Barnes','Asamblor',3500,'24 February 2004');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(187,1,'Subhan','Partridge','Asamblor',3120,'25 May 2012');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(188,0,'Nakita','Kirk','Operator masini',3500,'25 December 2003');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(189,0,'Choi','Alex','Operator masini',3150,'30 October 2006');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(190,0,'Sulaiman','Schwartz','Operator masini',2744,'10 July 2007');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(191,0,'Grameni','Costi','Operator masini',2700,'18 May 2008');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(192,0,'Alexandria','Holding','Operator masini',2750,'19 March 2014');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(193,0,'Huleni','Marius','Operator masini',2500,'12 January 2017');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(194,0,'Huleni','Tase','Operator masini',2500,'12 May 2019');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(195,0,'Bogdan','Capusan','Operator masini',3500,'15 May 2002');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(196,0,'Tate','Andrew','Operator masini',3450,'21 July 2002');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(197,1,'Popescu','Razvan','Operator masini',3400,'8 December 2004');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(198,1,'Popescu','Andy','Operator masini',2150,'30 June 2010');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(199,1,'Dancila','Viorica','Operator masini',2000,'1 January 2017');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(200,2,'Rueben','Kay','Operator masini',2000,'9 February 2018');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(201,2,'Traian','Basescu','Operator masini',2600,'30 April 2009');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(202,2,'Lionel','Messi','Operator masini',2600,'2 September 2010');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(203,2,'Felipe','Massa','Operator masini',2500,'15 October 2015');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(204,2,'Lewis','Hamilton','Operator masini',2000,'17 December 2018');
insert into Angajat
(Angajat_ID, Fabrica_ID, Nume, Prenume, Pozitie , Salariu, Data_angajare)
values
(205,2,'Carlos','Sainz','Operator masini',3000,'2 December 2006');

create table Client
(Client_ID int primary key,
Showroom_ID int,
Nume_client varchar(20) not null,
Prenume_client varchar(20) not null,
CNP int not null unique,
Numar_masini int not null,
Numar_telefon varchar(10) not null unique,
Email varchar(30) not null unique
);

alter table Client
add(
constraint fk_showroom_id_2 foreign key (Showroom_ID) references Showroom(Showroom_ID) on delete set null,
constraint check_nume_client check(regexp_like(Nume_client,'[a-zA-Z]')),
constraint check_prenume_client check(regexp_like(Prenume_client,'[a-zA-Z]')),
constraint check_CNP check(length(to_char(CNP))=13),
constraint check_nr_tel check((length(Numar_telefon)=10)and (regexp_like(Numar_telefon,'[0-9]'))),
constraint check_nr_mas check(Numar_masini>0),
constraint check_email_client check(regexp_like(Email,'[[:alnum:]]+@[[:alnum:]]+\.[[:alnum:]]'))
);

insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(0,0,'Ulmeanu','Cristian',5000730134135,1,'0741289528','piciu3007@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(1,0,'Tiberiu','Cutov',2940618386559,2,'0791749390','tiberiu@yahoo.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(2,0,'Tiberiu','Martinescu',2981204354281,1,'0735766290','martin@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(3,0,'Ciprian','Marandici',1851227182439,1,'0722972837','cip@yahoo.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(4,0,'Stefan','Mandachi',6010223028945,10,'0771828261','mandachi@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(5,0,'Turtoiu','Vlad',2880221206511,1,'0700109772','vlad@icloud.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(6,0,'Anatolie','Petran',1860127529827,1,'0774606259','petru@icloud.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(7,0,'Filip','Ciobanu',1960921387077,2,'0790955317','ciobanu@cnc.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(8,0,'Ciobanu','Andrei',2850227362063,3,'0729344084','cioban@icloud.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(9,0,'Rusu','Ionut',1970427434164,4,'0757298401','rusu@icomedy.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(10,0,'Ciodaru','Costin',1881109209193,1,'0700800514','ciodi@yahoo.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(11,1,'Nic','Tugurlan',2910201178042,2,'0786727246','nics@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(12,1,'Laurentiu','Pârvulescu',2850303242981,1,'0758353279','laur@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(13,2,'Danus','Calinescu',2871027320650,4,'0794104619','dan@atn.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(14,2,'Flaviu','Pirvulescu',1920519292782,1,'0766621107','flavi@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(15,3,'Ramona','Vaduva',5010109061255,2,'0728931681','ramouva@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(16,3,'Ramona','Chirita',2921214231988,1,'0792782868','dnarata@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(17,3,'Teohari','Baciu',5010702523730,4,'0786055337','teohariu@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(53,3,'Floare','Staicu',1950901026378,5,'0742419910','floaicu@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(18,3,'Georgeta','Ivascu',2900516306727,2,'0701419589','georscu@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(19,3,'Antonie','Gherman',2970120250641,1,'0735027090','antoman@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(20,3,'Adi','Chirita',6020817016528,3,'0706755739','adichita@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(21,4,'Pompiliu','Ichim',5010519152756,4,'0734364327','drpoim@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(22,4,'Alice','Bejan',6011215074574,5,'0748858793','aliceban@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(23,4,'Silvia','Kovacs',1990924053413,1,'0779699453','silvacs@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(24,4,'Viorela','Tanase',1941117205392,1,'0766844308','dsoarse@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(25,4,'Elvira','Sirbu',1910110243617,1,'0702019906','elvirbu@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(26,4,'Arina','Ardeleanu',2980720204915,1,'0798790169','arinaaanu@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(27,4,'Antim','Iacob',2940209018341,2,'0794959014','antimiob@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(28,4,'Olga','Iordache',5020411222903,2,'0717589107','olgaihe@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(29,4,'Lica','Sandor',6000719151026,2,'0703167248','licador@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(30,5,'Zamfir','Badea',2960405294430,1,'0724362152','zamfi@yahoo.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(31,5,'Bendeac','Mihai',1940721243355,3,'0759694299','bendeac.mihai@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(32,5,'Banel','Neagoe',1850731137956,1,'0734569104','banegoe@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(33,5,'Creanga','Ion',1961217395181,1,'0733730838','ion.creanga55@yahoo.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(34,6,'Zeno','Ardeleanu',2850522116740,2,'0758739501','zenoaranu@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(35,6,'Loredana','Dan',1980410218428,1,'0707577619','loredan@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(36,7,'Stefan','Dan Mihai',5000427117797,1,'0726107549','stefan.dan@icloud.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(37,7,'David','Grigorescu',2930304351341,1,'0780632184','davidscu@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(38,7,'Remus','Simion',2921013151056,2,'0771719359','remuion@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(39,7,'Pelin','Horia',2931208135343,3,'0754060596','horica@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(40,7,'Pelin','Ioan',1860208400114,2,'0732408902','neaion@yahoo.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(41,7,'Alexe','Muresan',2941104030220,1,'0767651929','ingalan@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(42,7,'Laurentiu','Pintea',2880326225861,2,'0717341004','drlautea@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(43,7,'Robertina','Dinu',2940710338128,3,'0799719861','robeinu@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(44,8,'Matei','Barbulescu',1960909115445,1,'0798073042','mateicu@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(45,8,'Dorina','Marginean',2990315125206,1,'0752701114','dsoaean@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(46,8,'Ortansa','Fratila',2851212119126,1,'0789177569','ortansla@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(47,9,'Fratila','Senol',1991014439517,1,'0760776257','senol@cnc.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(48,9,'Condrat','Mihai',1920602122049,1,'0700626506','mihai.condrat@icloud.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(49,9,'Lupu','Mihai',2920107212414,1,'0793603633','lupusor@yahoo.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(50,9,'Rotaru','Codru',2970316400632,2,'0735617228','rotucodru@gmail.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(51,9,'Ene','Mihai',1951101123811,1,'0774267065','yasuomain@yahoo.com');
insert into Client
(Client_ID, Showroom_ID, Nume_client, Prenume_client, CNP, Numar_masini, Numar_telefon, Email)
values
(52,9,'Costea','Ionut',2920527183864,1,'0757440393','costica@icloud.com');

--TRIGGERS

CREATE OR REPLACE TRIGGER trg_check_date_aparitie
  BEFORE INSERT OR UPDATE ON Lista_modele
  FOR EACH ROW
BEGIN
  IF( :new.Data_aparitie>SYSDATE )
  THEN
    RAISE_APPLICATION_ERROR( -20001, 'Invalid Data_aparitie: Data_aparitie trebuie sa fie mai mica sau egala decat data curenta');
    END IF;
END;

CREATE OR REPLACE TRIGGER trg_check_date_angajare
  BEFORE INSERT OR UPDATE ON Angajat
  FOR EACH ROW
BEGIN
  IF( :new.Data_angajare>SYSDATE )
  THEN
    RAISE_APPLICATION_ERROR( -20002, 'Invalid Data_angajare: Data_angajare trebuie sa fie mai mica sau egala decat data curenta');
    END IF;
END;

CREATE OR REPLACE TRIGGER trg_check_date_productie
  BEFORE INSERT OR UPDATE ON Masina
  FOR EACH ROW
declare aparitie lista_modele.data_aparitie%type;
BEGIN
    select Data_aparitie into aparitie
    from Lista_modele
    where Nume_model=:new.Nume_model;
  IF( :new.Data_productie<aparitie or :new.Data_productie>sysdate )
  THEN
    RAISE_APPLICATION_ERROR( -20003, 'Productia masinii nu poate fi inainte de aparitia modelului');
    END IF;
END;

create or replace TRIGGER trg_check_fabrica
  BEFORE INSERT OR UPDATE ON Showroom
  FOR EACH ROW
  declare counter integer;
BEGIN
  select count(*) into counter
  from Masina
  where (Fabrica_ID=:new.Fabrica_ID and :new.Nume_model=nume_model);
  IF(counter=0)
  THEN
    RAISE_APPLICATION_ERROR( -20004, 'Invalid Model Masina Showroom sau Fabrica ce aprovizioneaza showroomul: Modelul masinilor vandute in showroom trebuie sa apara macar o data in Fabrica de unde primeste masinile');
    END IF;
END;


