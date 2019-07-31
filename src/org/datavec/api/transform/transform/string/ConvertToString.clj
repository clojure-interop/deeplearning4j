(ns org.datavec.api.transform.transform.string.ConvertToString
  "Convert any value to a string."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.string ConvertToString]))

(defn ->convert-to-string
  "Constructor.

  column - `java.lang.String`"
  (^ConvertToString [^java.lang.String column]
    (new ConvertToString column)))

(defn map
  "Transform the writable in to a
  string

  writable - the writable to transform - `org.datavec.api.writable.Writable`

  returns: the string form of this writable - `org.datavec.api.writable.Text`"
  (^org.datavec.api.writable.Text [^ConvertToString this ^org.datavec.api.writable.Writable writable]
    (-> this (.map writable))))

