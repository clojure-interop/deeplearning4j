(ns org.datavec.api.transform.analysis.columns.StringAnalysis$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.columns StringAnalysis$Builder]))

(defn ->builder
  "Constructor."
  (^StringAnalysis$Builder []
    (new StringAnalysis$Builder )))

(defn min-length
  "min-length - `int`

  returns: `org.datavec.api.transform.analysis.columns.StringAnalysis$Builder`"
  (^org.datavec.api.transform.analysis.columns.StringAnalysis$Builder [^StringAnalysis$Builder this ^Integer min-length]
    (-> this (.minLength min-length))))

(defn count-total
  "count-total - `long`

  returns: `org.datavec.api.transform.analysis.columns.StringAnalysis$Builder`"
  (^org.datavec.api.transform.analysis.columns.StringAnalysis$Builder [^StringAnalysis$Builder this ^Long count-total]
    (-> this (.countTotal count-total))))

(defn sample-stdev-length
  "sample-stdev-length - `double`

  returns: `org.datavec.api.transform.analysis.columns.StringAnalysis$Builder`"
  (^org.datavec.api.transform.analysis.columns.StringAnalysis$Builder [^StringAnalysis$Builder this ^Double sample-stdev-length]
    (-> this (.sampleStdevLength sample-stdev-length))))

(defn max-length
  "max-length - `int`

  returns: `org.datavec.api.transform.analysis.columns.StringAnalysis$Builder`"
  (^org.datavec.api.transform.analysis.columns.StringAnalysis$Builder [^StringAnalysis$Builder this ^Integer max-length]
    (-> this (.maxLength max-length))))

(defn build
  "returns: `org.datavec.api.transform.analysis.columns.StringAnalysis`"
  (^org.datavec.api.transform.analysis.columns.StringAnalysis [^StringAnalysis$Builder this]
    (-> this (.build))))

(defn histogram-bucket-counts
  "histogram-bucket-counts - `long[]`

  returns: `org.datavec.api.transform.analysis.columns.StringAnalysis$Builder`"
  (^org.datavec.api.transform.analysis.columns.StringAnalysis$Builder [^StringAnalysis$Builder this histogram-bucket-counts]
    (-> this (.histogramBucketCounts histogram-bucket-counts))))

(defn mean-length
  "mean-length - `double`

  returns: `org.datavec.api.transform.analysis.columns.StringAnalysis$Builder`"
  (^org.datavec.api.transform.analysis.columns.StringAnalysis$Builder [^StringAnalysis$Builder this ^Double mean-length]
    (-> this (.meanLength mean-length))))

(defn histogram-buckets
  "histogram-buckets - `double[]`

  returns: `org.datavec.api.transform.analysis.columns.StringAnalysis$Builder`"
  (^org.datavec.api.transform.analysis.columns.StringAnalysis$Builder [^StringAnalysis$Builder this histogram-buckets]
    (-> this (.histogramBuckets histogram-buckets))))

(defn sample-variance-length
  "sample-variance-length - `double`

  returns: `org.datavec.api.transform.analysis.columns.StringAnalysis$Builder`"
  (^org.datavec.api.transform.analysis.columns.StringAnalysis$Builder [^StringAnalysis$Builder this ^Double sample-variance-length]
    (-> this (.sampleVarianceLength sample-variance-length))))

