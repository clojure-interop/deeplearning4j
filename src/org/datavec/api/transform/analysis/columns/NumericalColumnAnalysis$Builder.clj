(ns org.datavec.api.transform.analysis.columns.NumericalColumnAnalysis$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.columns NumericalColumnAnalysis$Builder]))

(defn ->builder
  "Constructor."
  (^NumericalColumnAnalysis$Builder []
    (new NumericalColumnAnalysis$Builder )))

(defn count-total
  "count-total - `long`

  returns: `T`"
  ([^NumericalColumnAnalysis$Builder this ^Long count-total]
    (-> this (.countTotal count-total))))

(defn mean
  "mean - `double`

  returns: `T`"
  ([^NumericalColumnAnalysis$Builder this ^Double mean]
    (-> this (.mean mean))))

(defn sample-variance
  "sample-variance - `double`

  returns: `T`"
  ([^NumericalColumnAnalysis$Builder this ^Double sample-variance]
    (-> this (.sampleVariance sample-variance))))

(defn count-positive
  "count-positive - `long`

  returns: `T`"
  ([^NumericalColumnAnalysis$Builder this ^Long count-positive]
    (-> this (.countPositive count-positive))))

(defn count-min-value
  "count-min-value - `long`

  returns: `T`"
  ([^NumericalColumnAnalysis$Builder this ^Long count-min-value]
    (-> this (.countMinValue count-min-value))))

(defn digest
  "digest - `com.tdunning.math.stats.TDigest`

  returns: `T`"
  ([^NumericalColumnAnalysis$Builder this ^com.tdunning.math.stats.TDigest digest]
    (-> this (.digest digest))))

(defn histogram-bucket-counts
  "histogram-bucket-counts - `long[]`

  returns: `T`"
  ([^NumericalColumnAnalysis$Builder this histogram-bucket-counts]
    (-> this (.histogramBucketCounts histogram-bucket-counts))))

(defn histogram-buckets
  "histogram-buckets - `double[]`

  returns: `T`"
  ([^NumericalColumnAnalysis$Builder this histogram-buckets]
    (-> this (.histogramBuckets histogram-buckets))))

(defn count-max-value
  "count-max-value - `long`

  returns: `T`"
  ([^NumericalColumnAnalysis$Builder this ^Long count-max-value]
    (-> this (.countMaxValue count-max-value))))

(defn sample-stdev
  "sample-stdev - `double`

  returns: `T`"
  ([^NumericalColumnAnalysis$Builder this ^Double sample-stdev]
    (-> this (.sampleStdev sample-stdev))))

(defn count-zero
  "count-zero - `long`

  returns: `T`"
  ([^NumericalColumnAnalysis$Builder this ^Long count-zero]
    (-> this (.countZero count-zero))))

(defn count-negative
  "count-negative - `long`

  returns: `T`"
  ([^NumericalColumnAnalysis$Builder this ^Long count-negative]
    (-> this (.countNegative count-negative))))

