(ns org.datavec.api.transform.metadata.TimeMetaData
  "TimeMetaData: Meta data for a date/time column.
 NOTE: Time values are stored in epoch (millisecond) format."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.metadata TimeMetaData]))

(defn ->time-meta-data
  "Constructor.

  Create a TimeMetaData column with no restriction on the allowable times

  name - `java.lang.String`
  time-zone - Timezone for this column. Typically used for parsing - `java.util.TimeZone`"
  (^TimeMetaData [^java.lang.String name ^java.util.TimeZone time-zone]
    (new TimeMetaData name time-zone))
  (^TimeMetaData [^java.lang.String name]
    (new TimeMetaData name))
  (^TimeMetaData [^java.lang.String name ^java.util.TimeZone time-zone ^java.lang.Long min-valid-time ^java.lang.Long max-valid-time]
    (new TimeMetaData name time-zone min-valid-time max-valid-time)))

(defn get-column-type
  "Description copied from interface: ColumnMetaData

  returns: `org.datavec.api.transform.ColumnType`"
  (^org.datavec.api.transform.ColumnType [^TimeMetaData this]
    (-> this (.getColumnType))))

(defn valid?
  "Description copied from interface: ColumnMetaData

  writable - Writable to check - `org.datavec.api.writable.Writable`

  returns: true if value, false if invalid - `boolean`"
  (^Boolean [^TimeMetaData this ^org.datavec.api.writable.Writable writable]
    (-> this (.isValid writable))))

(defn clone
  "returns: `org.datavec.api.transform.metadata.TimeMetaData`"
  (^org.datavec.api.transform.metadata.TimeMetaData [^TimeMetaData this]
    (-> this (.clone))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TimeMetaData this]
    (-> this (.toString))))

