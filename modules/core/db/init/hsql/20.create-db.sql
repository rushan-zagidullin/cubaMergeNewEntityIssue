-- begin SAMPLE_FOO
alter table SAMPLE_FOO add constraint FK_SAMPLE_FOO_MAIN_BAR foreign key (MAIN_BAR_ID) references SAMPLE_BAR(ID)^
-- end SAMPLE_FOO
-- begin SAMPLE_BAR
alter table SAMPLE_BAR add constraint FK_SAMPLE_BAR_FOO foreign key (FOO_ID) references SAMPLE_FOO(ID)^
create index IDX_SAMPLE_BAR_FOO on SAMPLE_BAR (FOO_ID)^
-- end SAMPLE_BAR
