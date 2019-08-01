(ns org.tensorflow.framework.SummaryOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework SummaryOrBuilder]))

(defn get-value-list
  "Set of values for the summary.
  repeated .tensorflow.Summary.Value value = 1;

  returns: `java.util.List<org.tensorflow.framework.Summary$Value>`"
  (^java.util.List [^SummaryOrBuilder this]
    (-> this (.getValueList))))

(defn get-value
  "Set of values for the summary.
  repeated .tensorflow.Summary.Value value = 1;

  index - `int`

  returns: `org.tensorflow.framework.Summary$Value`"
  (^org.tensorflow.framework.Summary$Value [^SummaryOrBuilder this ^Integer index]
    (-> this (.getValue index))))

(defn get-value-count
  "Set of values for the summary.
  repeated .tensorflow.Summary.Value value = 1;

  returns: `int`"
  (^Integer [^SummaryOrBuilder this]
    (-> this (.getValueCount))))

(defn get-value-or-builder-list
  "Set of values for the summary.
  repeated .tensorflow.Summary.Value value = 1;

  returns: `java.util.List<? extends org.tensorflow.framework.Summary$ValueOrBuilder>`"
  ([^SummaryOrBuilder this]
    (-> this (.getValueOrBuilderList))))

(defn get-value-or-builder
  "Set of values for the summary.
  repeated .tensorflow.Summary.Value value = 1;

  index - `int`

  returns: `org.tensorflow.framework.Summary$ValueOrBuilder`"
  (^org.tensorflow.framework.Summary$ValueOrBuilder [^SummaryOrBuilder this ^Integer index]
    (-> this (.getValueOrBuilder index))))

