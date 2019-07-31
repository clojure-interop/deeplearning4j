(ns org.deeplearning4j.clustering.cluster.ClusterSet
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.cluster ClusterSet]))

(defn ->cluster-set
  "Constructor.

  distance-function - `java.lang.String`
  inverse - `boolean`"
  (^ClusterSet [^java.lang.String distance-function ^Boolean inverse]
    (new ClusterSet distance-function inverse))
  (^ClusterSet [^Boolean inverse]
    (new ClusterSet inverse)))

(defn classify-points
  "points - `java.util.List`
  move-cluster-center - `boolean`"
  ([^ClusterSet this ^java.util.List points ^Boolean move-cluster-center]
    (-> this (.classifyPoints points move-cluster-center)))
  ([^ClusterSet this ^java.util.List points]
    (-> this (.classifyPoints points))))

(defn get-distance
  "m-1 - `org.deeplearning4j.clustering.cluster.Point`
  m-2 - `org.deeplearning4j.clustering.cluster.Point`

  returns: `double`"
  (^Double [^ClusterSet this ^org.deeplearning4j.clustering.cluster.Point m-1 ^org.deeplearning4j.clustering.cluster.Point m-2]
    (-> this (.getDistance m-1 m-2))))

(defn add-new-cluster-with-center
  "center - `org.deeplearning4j.clustering.cluster.Point`

  returns: `org.deeplearning4j.clustering.cluster.Cluster`"
  (^org.deeplearning4j.clustering.cluster.Cluster [^ClusterSet this ^org.deeplearning4j.clustering.cluster.Point center]
    (-> this (.addNewClusterWithCenter center))))

(defn nearest-cluster
  "point - `org.deeplearning4j.clustering.cluster.Point`

  returns: `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.clustering.cluster.Cluster,java.lang.Double>`"
  (^org.nd4j.linalg.primitives.Pair [^ClusterSet this ^org.deeplearning4j.clustering.cluster.Point point]
    (-> this (.nearestCluster point))))

(defn get-cluster-count
  "returns: `int`"
  (^Integer [^ClusterSet this]
    (-> this (.getClusterCount))))

(defn remove-empty-clusters
  "returns: `java.util.List<org.deeplearning4j.clustering.cluster.Cluster>`"
  (^java.util.List [^ClusterSet this]
    (-> this (.removeEmptyClusters))))

(defn inverse?
  "returns: `boolean`"
  (^Boolean [^ClusterSet this]
    (-> this (.isInverse))))

(defn get-most-populated-clusters
  "count - `int`

  returns: `java.util.List<org.deeplearning4j.clustering.cluster.Cluster>`"
  (^java.util.List [^ClusterSet this ^Integer count]
    (-> this (.getMostPopulatedClusters count))))

(defn get-cluster-center
  "cluster-id - `java.lang.String`

  returns: `org.deeplearning4j.clustering.cluster.Point`"
  (^org.deeplearning4j.clustering.cluster.Point [^ClusterSet this ^java.lang.String cluster-id]
    (-> this (.getClusterCenter cluster-id))))

(defn classify-point
  "point - `org.deeplearning4j.clustering.cluster.Point`
  move-cluster-center - `boolean`

  returns: `org.deeplearning4j.clustering.cluster.PointClassification`"
  (^org.deeplearning4j.clustering.cluster.PointClassification [^ClusterSet this ^org.deeplearning4j.clustering.cluster.Point point ^Boolean move-cluster-center]
    (-> this (.classifyPoint point move-cluster-center)))
  (^org.deeplearning4j.clustering.cluster.PointClassification [^ClusterSet this ^org.deeplearning4j.clustering.cluster.Point point]
    (-> this (.classifyPoint point))))

(defn get-cluster
  "id - `java.lang.String`

  returns: `org.deeplearning4j.clustering.cluster.Cluster`"
  (^org.deeplearning4j.clustering.cluster.Cluster [^ClusterSet this ^java.lang.String id]
    (-> this (.getCluster id))))

(defn get-distance-from-nearest-cluster
  "point - `org.deeplearning4j.clustering.cluster.Point`

  returns: `double`"
  (^Double [^ClusterSet this ^org.deeplearning4j.clustering.cluster.Point point]
    (-> this (.getDistanceFromNearestCluster point))))

(defn get-cluster-center-id
  "cluster-id - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ClusterSet this ^java.lang.String cluster-id]
    (-> this (.getClusterCenterId cluster-id))))

(defn remove-points
  ""
  ([^ClusterSet this]
    (-> this (.removePoints))))

