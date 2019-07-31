(ns org.datavec.api.transform.analysis.quality.string.StringQualityAddFunction
  "Created by Alex on 5/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.quality.string StringQualityAddFunction]))

(defn ->string-quality-add-function
  "Constructor."
  (^StringQualityAddFunction []
    (new StringQualityAddFunction )))

(defn apply
  "Description copied from interface: BiFunction

  v-1 - First argument - `org.datavec.api.transform.quality.columns.StringQuality`
  writable - Second argument - `org.datavec.api.writable.Writable`

  returns: Result - `org.datavec.api.transform.quality.columns.StringQuality`"
  (^org.datavec.api.transform.quality.columns.StringQuality [^StringQualityAddFunction this ^org.datavec.api.transform.quality.columns.StringQuality v-1 ^org.datavec.api.writable.Writable writable]
    (-> this (.apply v-1 writable))))

