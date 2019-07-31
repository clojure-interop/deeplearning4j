(ns org.datavec.api.transform.transform.string.ReplaceStringTransform
  "Replaces String values that match regular expressions."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.string ReplaceStringTransform]))

(defn ->replace-string-transform
  "Constructor.

  Constructs a new ReplaceStringTransform using the specified

  column-name - Name of the column - `java.lang.String`
  map - Key: regular expression; Value: replacement value - `java.util.Map`"
  (^ReplaceStringTransform [^java.lang.String column-name ^java.util.Map map]
    (new ReplaceStringTransform column-name map)))

(defn map
  "Description copied from class: BaseStringTransform

  writable - the writable to transform - `org.datavec.api.writable.Writable`

  returns: the string form of this writable - `org.datavec.api.writable.Text`"
  (^org.datavec.api.writable.Text [^ReplaceStringTransform this ^org.datavec.api.writable.Writable writable]
    (-> this (.map writable))))

