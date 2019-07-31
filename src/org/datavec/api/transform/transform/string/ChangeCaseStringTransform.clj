(ns org.datavec.api.transform.transform.string.ChangeCaseStringTransform
  "Change case (to, e.g, all lower case) of String column."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.string ChangeCaseStringTransform]))

(defn ->change-case-string-transform
  "Constructor.

  column - `java.lang.String`
  case-type - `org.datavec.api.transform.transform.string.ChangeCaseStringTransform$CaseType`"
  (^ChangeCaseStringTransform [^java.lang.String column ^org.datavec.api.transform.transform.string.ChangeCaseStringTransform$CaseType case-type]
    (new ChangeCaseStringTransform column case-type))
  (^ChangeCaseStringTransform [^java.lang.String column]
    (new ChangeCaseStringTransform column)))

(defn map
  "Description copied from class: BaseStringTransform

  writable - the writable to transform - `org.datavec.api.writable.Writable`

  returns: the string form of this writable - `org.datavec.api.writable.Text`"
  (^org.datavec.api.writable.Text [^ChangeCaseStringTransform this ^org.datavec.api.writable.Writable writable]
    (-> this (.map writable))))

