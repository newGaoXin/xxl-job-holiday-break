## 源 (Source)
https://github.com/xuxueli/xxl-job/

## 背景（Background）
遇到一些任务需要在节假日休息，每次都要手动暂停关闭，是一件很麻烦的事情
（It is very troublesome to manually suspend and close some tasks every time when you encounter some tasks that need to rest on holidays.）

## 使用 （Instructions For Use）
切换分支 2.3.0_holiday_break （check branches 2.3.0_holiday_break）

按照源文档进行部署使用，额外执行以下 SQL 语句（deploy and use according to the source document, and additionally execute the following SQL statements）

```sql
-- xxl_job_info add column holiday break
ALTER TABLE `xxl_job_info` ADD COLUMN holiday_break VARCHAR(16) NOT NULL DEFAULT 'CLOSE'

-- holiday break table
CREATE TABLE holiday(
    `id` BIGINT PRIMARY key auto_increment COMMENT 'id',
    `holiday_begin_date` datetime NOT NULL COMMENT '假期开始时间',
    `holiday_end_date` datetime not null comment '假期结束时间',
    `reamrk` VARCHAR(64) COMMENT '备注'
) COMMENT = '假期表'
create
```