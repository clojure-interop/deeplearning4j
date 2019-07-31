(ns org.datavec.api.transform.transform.string.MapAllStringsExceptListTransform
  "This method maps all String values, except those is the specified list, to a single String value"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.string MapAllStringsExceptListTransform]))

(defn ->map-all-strings-except-list-transform
  "Constructor.

  column-name - `java.lang.String`
  new-value - `java.lang.String`
  exceptions - `java.util.List`"
  (^MapAllStringsExceptListTransform [^java.lang.String column-name ^java.lang.String new-value ^java.util.List exceptions]
    (new MapAllStringsExceptListTransform column-name new-value exceptions)))

(defn map
  "Description copied from class: BaseStringTransform

  writable - the writable to transform - `org.datavec.api.writable.Writable`

  returns: the string form of this writable - `org.datavec.api.writable.Text`"
  (^org.datavec.api.writable.Text [^MapAllStringsExceptListTransform this ^org.datavec.api.writable.Writable writable]
    (-> this (.map writable))))

