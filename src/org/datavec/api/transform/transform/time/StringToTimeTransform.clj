(ns org.datavec.api.transform.transform.time.StringToTimeTransform
  "Convert a String column to a time column by parsing the date/time String, using a JodaTime.

 Time format is specified as per http://www.joda.org/joda-time/apidocs/org/joda/time/format/DateTimeFormat.html"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.time StringToTimeTransform]))

(defn ->string-to-time-transform
  "Constructor.

  Instantiate this without a time format specified.
  If this constructor is used, this transform will be allowed
  to handle several common transforms as defined in the
  static formats array.

  column-name - Name of the String column - `java.lang.String`
  time-zone - Timezone for time parsing - `java.util.TimeZone`"
  (^StringToTimeTransform [^java.lang.String column-name ^java.util.TimeZone time-zone]
    (new StringToTimeTransform column-name time-zone))
  (^StringToTimeTransform [^java.lang.String column-name ^java.lang.String time-format ^java.util.TimeZone time-zone ^java.lang.Long min-valid-time ^java.lang.Long max-valid-time]
    (new StringToTimeTransform column-name time-format time-zone min-valid-time max-valid-time))
  (^StringToTimeTransform [^java.lang.String column-name ^java.lang.String time-format ^java.util.TimeZone time-zone]
    (new StringToTimeTransform column-name time-format time-zone)))

(defn get-new-column-meta-data
  "new-name - `java.lang.String`
  old-column-type - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.metadata.ColumnMetaData`"
  (^org.datavec.api.transform.metadata.ColumnMetaData [^StringToTimeTransform this ^java.lang.String new-name ^org.datavec.api.transform.metadata.ColumnMetaData old-column-type]
    (-> this (.getNewColumnMetaData new-name old-column-type))))

(defn map
  "Transform an object
  in to another object

  input - the record to transform - `java.lang.Object`

  returns: the transformed writable - `java.lang.Object`"
  (^java.lang.Object [^StringToTimeTransform this ^java.lang.Object input]
    (-> this (.map input))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StringToTimeTransform this]
    (-> this (.toString))))

