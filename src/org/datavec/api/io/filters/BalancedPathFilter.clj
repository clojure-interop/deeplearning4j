(ns org.datavec.api.io.filters.BalancedPathFilter
  "Randomizes the order of paths in an array and removes paths randomly
 to have the same number of paths for each label. Further interlaces the paths
 on output based on their labels, to obtain easily optimal batches for training."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.io.filters BalancedPathFilter]))

(defn ->balanced-path-filter
  "Constructor.

  Constructs an instance of the PathFilter. If minPathsPerLabel > 0,
  it might return an unbalanced set if the value is larger than the number of
  examples available for the label with the minimum amount.

  random - object to use - `java.util.Random`
  extensions - of files to keep - `java.lang.String[]`
  label-generator - to obtain labels from paths - `org.datavec.api.io.labels.PathLabelGenerator`
  max-paths - max number of paths to return (0 == unlimited) - `long`
  max-labels - max number of labels to return (0 == unlimited) - `long`
  min-paths-per-label - min number of paths per labels to return - `long`
  max-paths-per-label - max number of paths per labels to return (0 == unlimited) - `long`
  labels - of the paths to keep (empty set == keep all paths) - `java.lang.String`"
  (^BalancedPathFilter [^java.util.Random random extensions ^org.datavec.api.io.labels.PathLabelGenerator label-generator ^Long max-paths ^Long max-labels ^Long min-paths-per-label ^Long max-paths-per-label ^java.lang.String labels]
    (new BalancedPathFilter random extensions label-generator max-paths max-labels min-paths-per-label max-paths-per-label labels))
  (^BalancedPathFilter [^java.util.Random random ^org.datavec.api.io.labels.PathLabelGenerator label-generator ^Long max-paths ^Long max-labels ^Long max-paths-per-label]
    (new BalancedPathFilter random label-generator max-paths max-labels max-paths-per-label))
  (^BalancedPathFilter [^java.util.Random random extensions ^org.datavec.api.io.labels.PathLabelGenerator label-generator ^Long max-paths-per-label]
    (new BalancedPathFilter random extensions label-generator max-paths-per-label))
  (^BalancedPathFilter [^java.util.Random random extensions ^org.datavec.api.io.labels.PathLabelGenerator label-generator]
    (new BalancedPathFilter random extensions label-generator)))

(defn filter
  "paths - `java.net.URI[]`

  returns: `java.net.URI[]`"
  ([^BalancedPathFilter this paths]
    (-> this (.filter paths))))

