# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/en/1.0.0/)
and this project adheres to [Semantic Versioning](http://semver.org/spec/v2.0.0.html).

## [TBD] 
### Changed
- Upgraded `jackson-databind` to 2.9.9 (was 2.9.7).

## [2.0.0] - 2019-06-11
### Changed
- Upgraded `jackson-databind` to 2.9.7 (was 2.9.0).
- Upgraded `hive-jdbc` to 2.3.4 (was 2.0.0).
- Upgraded `hotels-oss-parent` to 4.0.1 (was 2.0.6).
- Changed dependency from `com.microsoft.sqlserver:sqljdbc` (4.1) to `com.microsoft.sqlserver:mssql-jdbc` (6.4.0.jre7).
- Changed dependency from `9.4.1208-jdbc42-atlassian-hosted` (4.1) to `org.postgresql:postgresql` (42.2.5.jre7).

### Removed
- DB2 and Teradata drivers (not available in Maven Central).

## [1.0.0] - 2018-10-30
### Added
- Initial release
