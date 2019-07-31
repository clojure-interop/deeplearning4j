(ns org.deeplearning4j.clustering.kmeans.KMeansClustering
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.kmeans KMeansClustering]))

(defn *setup
  "Setup a kmeans instance

  cluster-count - the number of clusters - `int`
  max-iteration-count - the max number of iterationsto run kmeans - `int`
  distance-function - the distance function to use for grouping - `java.lang.String`
  inverse - `boolean`

  returns: `org.deeplearning4j.clustering.kmeans.KMeansClustering`"
  (^org.deeplearning4j.clustering.kmeans.KMeansClustering [^Integer cluster-count ^Integer max-iteration-count ^java.lang.String distance-function ^Boolean inverse]
    (KMeansClustering/setup cluster-count max-iteration-count distance-function inverse))
  (^org.deeplearning4j.clustering.kmeans.KMeansClustering [^Integer cluster-count ^Integer max-iteration-count ^java.lang.String distance-function]
    (KMeansClustering/setup cluster-count max-iteration-count distance-function))
  (^org.deeplearning4j.clustering.kmeans.KMeansClustering [^Integer cluster-count ^Double min-distribution-variation-rate ^java.lang.String distance-function ^Boolean inverse ^Boolean allow-empty-clusters]
    (KMeansClustering/setup cluster-count min-distribution-variation-rate distance-function inverse allow-empty-clusters)))

