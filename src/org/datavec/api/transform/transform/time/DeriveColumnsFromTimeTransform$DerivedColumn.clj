(ns org.datavec.api.transform.transform.time.DeriveColumnsFromTimeTransform$DerivedColumn
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.time DeriveColumnsFromTimeTransform$DerivedColumn]))

(defn ->derived-column
  "Constructor.

  column-name - `java.lang.String`
  column-type - `org.datavec.api.transform.ColumnType`
  format - `java.lang.String`
  date-time-zone - `org.joda.time.DateTimeZone`
  field-type - `org.joda.time.DateTimeFieldType`"
  (^DeriveColumnsFromTimeTransform$DerivedColumn [^java.lang.String column-name ^org.datavec.api.transform.ColumnType column-type ^java.lang.String format ^org.joda.time.DateTimeZone date-time-zone ^org.joda.time.DateTimeFieldType field-type]
    (new DeriveColumnsFromTimeTransform$DerivedColumn column-name column-type format date-time-zone field-type)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DeriveColumnsFromTimeTransform$DerivedColumn this]
    (-> this (.toString))))

