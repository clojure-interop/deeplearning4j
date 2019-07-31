(ns org.datavec.api.transform.transform.string.RemoveWhiteSpaceTransform
  "String transform that removes all whitespace charaters"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.string RemoveWhiteSpaceTransform]))

(defn ->remove-white-space-transform
  "Constructor.

  column-name - `java.lang.String`"
  (^RemoveWhiteSpaceTransform [^java.lang.String column-name]
    (new RemoveWhiteSpaceTransform column-name)))

(defn map
  "Description copied from class: BaseStringTransform

  writable - the writable to transform - `org.datavec.api.writable.Writable`

  returns: the string form of this writable - `org.datavec.api.writable.Text`"
  (^org.datavec.api.writable.Text [^RemoveWhiteSpaceTransform this ^org.datavec.api.writable.Writable writable]
    (-> this (.map writable))))

