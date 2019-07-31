(ns org.datavec.api.transform.transform.string.ReplaceEmptyStringTransform
  "Replace empty String values with the specified String"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.string ReplaceEmptyStringTransform]))

(defn ->replace-empty-string-transform
  "Constructor.

  column-name - `java.lang.String`
  value - `java.lang.String`"
  (^ReplaceEmptyStringTransform [^java.lang.String column-name ^java.lang.String value]
    (new ReplaceEmptyStringTransform column-name value)))

(defn map
  "Description copied from class: BaseStringTransform

  writable - the writable to transform - `org.datavec.api.writable.Writable`

  returns: the string form of this writable - `org.datavec.api.writable.Text`"
  (^org.datavec.api.writable.Text [^ReplaceEmptyStringTransform this ^org.datavec.api.writable.Writable writable]
    (-> this (.map writable))))

