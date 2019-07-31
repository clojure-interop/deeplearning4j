(ns org.deeplearning4j.clustering.cluster.Cluster
  "A cluster."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.cluster Cluster]))

(defn ->cluster
  "Constructor.

  center - `org.deeplearning4j.clustering.cluster.Point`
  inverse - `boolean`
  distance-function - `java.lang.String`"
  (^Cluster [^org.deeplearning4j.clustering.cluster.Point center ^Boolean inverse ^java.lang.String distance-function]
    (new Cluster center inverse distance-function))
  (^Cluster [^org.deeplearning4j.clustering.cluster.Point center ^java.lang.String distance-function]
    (new Cluster center distance-function))
  (^Cluster []
    (new Cluster )))

(defn get-distance-to-center
  "Get the distance to the given
  point from the cluster

  point - the point to get the distance for - `org.deeplearning4j.clustering.cluster.Point`

  returns: `double`"
  (^Double [^Cluster this ^org.deeplearning4j.clustering.cluster.Point point]
    (-> this (.getDistanceToCenter point))))

(defn add-point
  "Add a point to the cluster

  point - the point to add - `org.deeplearning4j.clustering.cluster.Point`
  move-cluster-center - whether to updatethe cluster centroid or not - `boolean`"
  ([^Cluster this ^org.deeplearning4j.clustering.cluster.Point point ^Boolean move-cluster-center]
    (-> this (.addPoint point move-cluster-center)))
  ([^Cluster this ^org.deeplearning4j.clustering.cluster.Point point]
    (-> this (.addPoint point))))

(defn remove-points
  "Clear out the ponits"
  ([^Cluster this]
    (-> this (.removePoints))))

(defn empty?
  "Whether the cluster is empty or not

  returns: `boolean`"
  (^Boolean [^Cluster this]
    (-> this (.isEmpty))))

(defn get-point
  "Return the point with the given id

  id - `java.lang.String`

  returns: `org.deeplearning4j.clustering.cluster.Point`"
  (^org.deeplearning4j.clustering.cluster.Point [^Cluster this ^java.lang.String id]
    (-> this (.getPoint id))))

(defn remove-point
  "Remove the point and return it

  id - `java.lang.String`

  returns: `org.deeplearning4j.clustering.cluster.Point`"
  (^org.deeplearning4j.clustering.cluster.Point [^Cluster this ^java.lang.String id]
    (-> this (.removePoint id))))

