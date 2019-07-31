(ns org.datavec.api.transform.analysis.DataVecAnalysisUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis DataVecAnalysisUtils]))

(defn *merge-counters
  "column-analysis - `java.util.List`
  histogram-counters - `java.util.List`"
  ([^java.util.List column-analysis ^java.util.List histogram-counters]
    (DataVecAnalysisUtils/mergeCounters column-analysis histogram-counters)))

(defn *convert-counters
  "counters - `java.util.List`
  mins-maxes - `double[][]`
  column-types - `java.util.List`

  returns: `java.util.List<org.datavec.api.transform.analysis.columns.ColumnAnalysis>`"
  (^java.util.List [^java.util.List counters mins-maxes ^java.util.List column-types]
    (DataVecAnalysisUtils/convertCounters counters mins-maxes column-types)))

