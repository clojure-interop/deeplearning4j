(ns org.deeplearning4j.clustering.cluster.ClusterUtils
  "Basic cluster utilities"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.cluster ClusterUtils]))

(defn ->cluster-utils
  "Constructor."
  (^ClusterUtils []
    (new ClusterUtils )))

(defn *classify-points
  "Classify the set of points base on cluster centers. This also adds each point to the ClusterSet

  cluster-set - `org.deeplearning4j.clustering.cluster.ClusterSet`
  points - `java.util.List`
  executor-service - `java.util.concurrent.ExecutorService`

  returns: `org.deeplearning4j.clustering.info.ClusterSetInfo`"
  (^org.deeplearning4j.clustering.info.ClusterSetInfo [^org.deeplearning4j.clustering.cluster.ClusterSet cluster-set ^java.util.List points ^java.util.concurrent.ExecutorService executor-service]
    (ClusterUtils/classifyPoints cluster-set points executor-service)))

(defn *split-most-populated-clusters
  "cluster-set - `org.deeplearning4j.clustering.cluster.ClusterSet`
  cluster-set-info - `org.deeplearning4j.clustering.info.ClusterSetInfo`
  count - `int`
  executor-service - `java.util.concurrent.ExecutorService`"
  ([^org.deeplearning4j.clustering.cluster.ClusterSet cluster-set ^org.deeplearning4j.clustering.info.ClusterSetInfo cluster-set-info ^Integer count ^java.util.concurrent.ExecutorService executor-service]
    (ClusterUtils/splitMostPopulatedClusters cluster-set cluster-set-info count executor-service)))

(defn *refresh-cluster-center
  "cluster - `org.deeplearning4j.clustering.cluster.Cluster`
  cluster-info - `org.deeplearning4j.clustering.info.ClusterInfo`"
  ([^org.deeplearning4j.clustering.cluster.Cluster cluster ^org.deeplearning4j.clustering.info.ClusterInfo cluster-info]
    (ClusterUtils/refreshClusterCenter cluster cluster-info)))

(defn *get-clusters-where-average-distance-from-center-greater-than
  "cluster-set - `org.deeplearning4j.clustering.cluster.ClusterSet`
  info - `org.deeplearning4j.clustering.info.ClusterSetInfo`
  maximum-average-distance - `double`

  returns: `java.util.List<org.deeplearning4j.clustering.cluster.Cluster>`"
  (^java.util.List [^org.deeplearning4j.clustering.cluster.ClusterSet cluster-set ^org.deeplearning4j.clustering.info.ClusterSetInfo info ^Double maximum-average-distance]
    (ClusterUtils/getClustersWhereAverageDistanceFromCenterGreaterThan cluster-set info maximum-average-distance)))

(defn *compute-cluster-infos
  "cluster - `org.deeplearning4j.clustering.cluster.Cluster`
  distance-function - `java.lang.String`

  returns: `org.deeplearning4j.clustering.info.ClusterInfo`"
  (^org.deeplearning4j.clustering.info.ClusterInfo [^org.deeplearning4j.clustering.cluster.Cluster cluster ^java.lang.String distance-function]
    (ClusterUtils/computeClusterInfos cluster distance-function)))

(defn *get-most-spread-out-clusters
  "cluster-set - `org.deeplearning4j.clustering.cluster.ClusterSet`
  info - `org.deeplearning4j.clustering.info.ClusterSetInfo`
  count - `int`

  returns: `java.util.List<org.deeplearning4j.clustering.cluster.Cluster>`"
  (^java.util.List [^org.deeplearning4j.clustering.cluster.ClusterSet cluster-set ^org.deeplearning4j.clustering.info.ClusterSetInfo info ^Integer count]
    (ClusterUtils/getMostSpreadOutClusters cluster-set info count)))

(defn *refresh-clusters-centers
  "cluster-set - `org.deeplearning4j.clustering.cluster.ClusterSet`
  cluster-set-info - `org.deeplearning4j.clustering.info.ClusterSetInfo`
  executor-service - `java.util.concurrent.ExecutorService`"
  ([^org.deeplearning4j.clustering.cluster.ClusterSet cluster-set ^org.deeplearning4j.clustering.info.ClusterSetInfo cluster-set-info ^java.util.concurrent.ExecutorService executor-service]
    (ClusterUtils/refreshClustersCenters cluster-set cluster-set-info executor-service)))

(defn *split-most-spread-out-clusters
  "cluster-set - `org.deeplearning4j.clustering.cluster.ClusterSet`
  cluster-set-info - `org.deeplearning4j.clustering.info.ClusterSetInfo`
  count - `int`
  executor-service - `java.util.concurrent.ExecutorService`

  returns: `int`"
  (^Integer [^org.deeplearning4j.clustering.cluster.ClusterSet cluster-set ^org.deeplearning4j.clustering.info.ClusterSetInfo cluster-set-info ^Integer count ^java.util.concurrent.ExecutorService executor-service]
    (ClusterUtils/splitMostSpreadOutClusters cluster-set cluster-set-info count executor-service)))

(defn *compute-cluster-set-info
  "cluster-set - `org.deeplearning4j.clustering.cluster.ClusterSet`
  executor-service - `java.util.concurrent.ExecutorService`

  returns: `org.deeplearning4j.clustering.info.ClusterSetInfo`"
  (^org.deeplearning4j.clustering.info.ClusterSetInfo [^org.deeplearning4j.clustering.cluster.ClusterSet cluster-set ^java.util.concurrent.ExecutorService executor-service]
    (ClusterUtils/computeClusterSetInfo cluster-set executor-service))
  (^org.deeplearning4j.clustering.info.ClusterSetInfo [^org.deeplearning4j.clustering.cluster.ClusterSet cluster-set]
    (ClusterUtils/computeClusterSetInfo cluster-set)))

(defn *derive-cluster-info-distance-statistics
  "info - `org.deeplearning4j.clustering.info.ClusterInfo`"
  ([^org.deeplearning4j.clustering.info.ClusterInfo info]
    (ClusterUtils/deriveClusterInfoDistanceStatistics info)))

(defn *split-clusters-where-maximum-distance-from-center-greater-than
  "cluster-set - `org.deeplearning4j.clustering.cluster.ClusterSet`
  cluster-set-info - `org.deeplearning4j.clustering.info.ClusterSetInfo`
  max-within-cluster-distance - `double`
  executor-service - `java.util.concurrent.ExecutorService`

  returns: `int`"
  (^Integer [^org.deeplearning4j.clustering.cluster.ClusterSet cluster-set ^org.deeplearning4j.clustering.info.ClusterSetInfo cluster-set-info ^Double max-within-cluster-distance ^java.util.concurrent.ExecutorService executor-service]
    (ClusterUtils/splitClustersWhereMaximumDistanceFromCenterGreaterThan cluster-set cluster-set-info max-within-cluster-distance executor-service)))

(defn *compute-square-distances-from-nearest-cluster
  "cluster-set - `org.deeplearning4j.clustering.cluster.ClusterSet`
  points - `java.util.List`
  previous-dxs - `org.nd4j.linalg.api.ndarray.INDArray`
  executor-service - `java.util.concurrent.ExecutorService`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.deeplearning4j.clustering.cluster.ClusterSet cluster-set ^java.util.List points ^org.nd4j.linalg.api.ndarray.INDArray previous-dxs ^java.util.concurrent.ExecutorService executor-service]
    (ClusterUtils/computeSquareDistancesFromNearestCluster cluster-set points previous-dxs executor-service)))

(defn *split-clusters
  "cluster-set - `org.deeplearning4j.clustering.cluster.ClusterSet`
  cluster-set-info - `org.deeplearning4j.clustering.info.ClusterSetInfo`
  clusters - `java.util.List`
  max-distance - `double`
  executor-service - `java.util.concurrent.ExecutorService`"
  ([^org.deeplearning4j.clustering.cluster.ClusterSet cluster-set ^org.deeplearning4j.clustering.info.ClusterSetInfo cluster-set-info ^java.util.List clusters ^Double max-distance ^java.util.concurrent.ExecutorService executor-service]
    (ClusterUtils/splitClusters cluster-set cluster-set-info clusters max-distance executor-service))
  ([^org.deeplearning4j.clustering.cluster.ClusterSet cluster-set ^org.deeplearning4j.clustering.info.ClusterSetInfo cluster-set-info ^java.util.List clusters ^java.util.concurrent.ExecutorService executor-service]
    (ClusterUtils/splitClusters cluster-set cluster-set-info clusters executor-service)))

(defn *classify-point
  "cluster-set - `org.deeplearning4j.clustering.cluster.ClusterSet`
  point - `org.deeplearning4j.clustering.cluster.Point`

  returns: `org.deeplearning4j.clustering.cluster.PointClassification`"
  (^org.deeplearning4j.clustering.cluster.PointClassification [^org.deeplearning4j.clustering.cluster.ClusterSet cluster-set ^org.deeplearning4j.clustering.cluster.Point point]
    (ClusterUtils/classifyPoint cluster-set point)))

(defn *split-clusters-where-average-distance-from-center-greater-than
  "cluster-set - `org.deeplearning4j.clustering.cluster.ClusterSet`
  cluster-set-info - `org.deeplearning4j.clustering.info.ClusterSetInfo`
  max-within-cluster-distance - `double`
  executor-service - `java.util.concurrent.ExecutorService`

  returns: `int`"
  (^Integer [^org.deeplearning4j.clustering.cluster.ClusterSet cluster-set ^org.deeplearning4j.clustering.info.ClusterSetInfo cluster-set-info ^Double max-within-cluster-distance ^java.util.concurrent.ExecutorService executor-service]
    (ClusterUtils/splitClustersWhereAverageDistanceFromCenterGreaterThan cluster-set cluster-set-info max-within-cluster-distance executor-service)))

(defn *apply-optimization
  "optimization - `org.deeplearning4j.clustering.strategy.OptimisationStrategy`
  cluster-set - `org.deeplearning4j.clustering.cluster.ClusterSet`
  cluster-set-info - `org.deeplearning4j.clustering.info.ClusterSetInfo`
  executor - `java.util.concurrent.ExecutorService`

  returns: `boolean`"
  (^Boolean [^org.deeplearning4j.clustering.strategy.OptimisationStrategy optimization ^org.deeplearning4j.clustering.cluster.ClusterSet cluster-set ^org.deeplearning4j.clustering.info.ClusterSetInfo cluster-set-info ^java.util.concurrent.ExecutorService executor]
    (ClusterUtils/applyOptimization optimization cluster-set cluster-set-info executor)))

(defn *get-clusters-where-maximum-distance-from-center-greater-than
  "cluster-set - `org.deeplearning4j.clustering.cluster.ClusterSet`
  info - `org.deeplearning4j.clustering.info.ClusterSetInfo`
  maximum-distance - `double`

  returns: `java.util.List<org.deeplearning4j.clustering.cluster.Cluster>`"
  (^java.util.List [^org.deeplearning4j.clustering.cluster.ClusterSet cluster-set ^org.deeplearning4j.clustering.info.ClusterSetInfo info ^Double maximum-distance]
    (ClusterUtils/getClustersWhereMaximumDistanceFromCenterGreaterThan cluster-set info maximum-distance)))

