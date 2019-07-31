(ns org.datavec.api.transform.transform.time.DeriveColumnsFromTimeTransform$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.time DeriveColumnsFromTimeTransform$Builder]))

(defn ->builder
  "Constructor.

  time-column-name - The name of the time column from which to derive the new values - `java.lang.String`"
  (^DeriveColumnsFromTimeTransform$Builder [^java.lang.String time-column-name]
    (new DeriveColumnsFromTimeTransform$Builder time-column-name)))

(defn insert-after
  "Where should the new columns be inserted?
  By default, they will be inserted after the source column

  column-name - Name of the column to insert the derived columns after - `java.lang.String`

  returns: `org.datavec.api.transform.transform.time.DeriveColumnsFromTimeTransform$Builder`"
  (^org.datavec.api.transform.transform.time.DeriveColumnsFromTimeTransform$Builder [^DeriveColumnsFromTimeTransform$Builder this ^java.lang.String column-name]
    (-> this (.insertAfter column-name))))

(defn add-string-derived-column
  "Add a String column (for example, human readable format), derived from the time

  column-name - Name of the new/derived column - `java.lang.String`
  format - Joda time format, as per http://www.joda.org/joda-time/apidocs/org/joda/time/format/DateTimeFormat.html - `java.lang.String`
  time-zone - Timezone to use for formatting - `org.joda.time.DateTimeZone`

  returns: `org.datavec.api.transform.transform.time.DeriveColumnsFromTimeTransform$Builder`"
  (^org.datavec.api.transform.transform.time.DeriveColumnsFromTimeTransform$Builder [^DeriveColumnsFromTimeTransform$Builder this ^java.lang.String column-name ^java.lang.String format ^org.joda.time.DateTimeZone time-zone]
    (-> this (.addStringDerivedColumn column-name format time-zone))))

(defn add-integer-derived-column
  "Add an integer derived column - for example, the hour of day, etc. Uses timezone from the time column metadata

  column-name - Name of the column - `java.lang.String`
  type - Type of field (for example, DateTimeFieldType.hourOfDay() etc) - `org.joda.time.DateTimeFieldType`

  returns: `org.datavec.api.transform.transform.time.DeriveColumnsFromTimeTransform$Builder`"
  (^org.datavec.api.transform.transform.time.DeriveColumnsFromTimeTransform$Builder [^DeriveColumnsFromTimeTransform$Builder this ^java.lang.String column-name ^org.joda.time.DateTimeFieldType type]
    (-> this (.addIntegerDerivedColumn column-name type))))

(defn build
  "Create the transform instance

  returns: `org.datavec.api.transform.transform.time.DeriveColumnsFromTimeTransform`"
  (^org.datavec.api.transform.transform.time.DeriveColumnsFromTimeTransform [^DeriveColumnsFromTimeTransform$Builder this]
    (-> this (.build))))

