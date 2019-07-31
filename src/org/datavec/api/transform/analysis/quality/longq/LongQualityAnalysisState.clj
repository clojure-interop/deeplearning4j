(ns org.datavec.api.transform.analysis.quality.longq.LongQualityAnalysisState
  "Created by huitseeker on 3/6/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.quality.longq LongQualityAnalysisState]))

(defn ->long-quality-analysis-state
  "Constructor.

  long-meta-data - `org.datavec.api.transform.metadata.LongMetaData`"
  (^LongQualityAnalysisState [^org.datavec.api.transform.metadata.LongMetaData long-meta-data]
    (new LongQualityAnalysisState long-meta-data)))

(defn add
  "writable - `org.datavec.api.writable.Writable`

  returns: `org.datavec.api.transform.analysis.quality.longq.LongQualityAnalysisState`"
  (^org.datavec.api.transform.analysis.quality.longq.LongQualityAnalysisState [^LongQualityAnalysisState this ^org.datavec.api.writable.Writable writable]
    (-> this (.add writable))))

(defn merge
  "other - `org.datavec.api.transform.analysis.quality.longq.LongQualityAnalysisState`

  returns: `org.datavec.api.transform.analysis.quality.longq.LongQualityAnalysisState`"
  (^org.datavec.api.transform.analysis.quality.longq.LongQualityAnalysisState [^LongQualityAnalysisState this ^org.datavec.api.transform.analysis.quality.longq.LongQualityAnalysisState other]
    (-> this (.merge other))))

(defn get-column-quality
  "returns: `org.datavec.api.transform.quality.columns.ColumnQuality`"
  (^org.datavec.api.transform.quality.columns.ColumnQuality [^LongQualityAnalysisState this]
    (-> this (.getColumnQuality))))

