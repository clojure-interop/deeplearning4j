(ns org.datavec.api.transform.transform.string.StringMapTransform
  "A simple String -> String map function.
 Keys in the map are the original values; the Values in the map are their replacements.
 If a String appears in the data but does not appear in the provided map (as a key), that String values will
 not be modified."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.string StringMapTransform]))

(defn ->string-map-transform
  "Constructor.

  column-name - Name of the column - `java.lang.String`
  map - Key: From. Value: To - `java.util.Map`"
  (^StringMapTransform [^java.lang.String column-name ^java.util.Map map]
    (new StringMapTransform column-name map)))

(defn map
  "Description copied from class: BaseStringTransform

  writable - the writable to transform - `org.datavec.api.writable.Writable`

  returns: the string form of this writable - `org.datavec.api.writable.Text`"
  (^org.datavec.api.writable.Text [^StringMapTransform this ^org.datavec.api.writable.Writable writable]
    (-> this (.map writable))))

