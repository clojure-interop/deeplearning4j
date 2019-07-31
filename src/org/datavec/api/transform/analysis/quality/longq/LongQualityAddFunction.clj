(ns org.datavec.api.transform.analysis.quality.longq.LongQualityAddFunction
  "Created by Alex on 5/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.quality.longq LongQualityAddFunction]))

(defn ->long-quality-add-function
  "Constructor."
  (^LongQualityAddFunction []
    (new LongQualityAddFunction )))

(defn apply
  "Description copied from interface: BiFunction

  v-1 - First argument - `org.datavec.api.transform.quality.columns.LongQuality`
  writable - Second argument - `org.datavec.api.writable.Writable`

  returns: Result - `org.datavec.api.transform.quality.columns.LongQuality`"
  (^org.datavec.api.transform.quality.columns.LongQuality [^LongQualityAddFunction this ^org.datavec.api.transform.quality.columns.LongQuality v-1 ^org.datavec.api.writable.Writable writable]
    (-> this (.apply v-1 writable))))

