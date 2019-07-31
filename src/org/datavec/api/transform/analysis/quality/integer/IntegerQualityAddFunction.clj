(ns org.datavec.api.transform.analysis.quality.integer.IntegerQualityAddFunction
  "Created by Alex on 5/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.quality.integer IntegerQualityAddFunction]))

(defn ->integer-quality-add-function
  "Constructor."
  (^IntegerQualityAddFunction []
    (new IntegerQualityAddFunction )))

(defn apply
  "Description copied from interface: BiFunction

  v-1 - First argument - `org.datavec.api.transform.quality.columns.IntegerQuality`
  writable - Second argument - `org.datavec.api.writable.Writable`

  returns: Result - `org.datavec.api.transform.quality.columns.IntegerQuality`"
  (^org.datavec.api.transform.quality.columns.IntegerQuality [^IntegerQualityAddFunction this ^org.datavec.api.transform.quality.columns.IntegerQuality v-1 ^org.datavec.api.writable.Writable writable]
    (-> this (.apply v-1 writable))))

