(ns org.deeplearning4j.clustering.info.ClusterSetInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.info ClusterSetInfo]))

(defn ->cluster-set-info
  "Constructor.

  inverse - `boolean`
  thread-safe - `boolean`"
  (^ClusterSetInfo [^Boolean inverse ^Boolean thread-safe]
    (new ClusterSetInfo inverse thread-safe))
  (^ClusterSetInfo [^Boolean inverse]
    (new ClusterSetInfo inverse)))

(defn *initialize
  "cluster-set - `org.deeplearning4j.clustering.cluster.ClusterSet`
  thread-safe - `boolean`

  returns: `org.deeplearning4j.clustering.info.ClusterSetInfo`"
  (^org.deeplearning4j.clustering.info.ClusterSetInfo [^org.deeplearning4j.clustering.cluster.ClusterSet cluster-set ^Boolean thread-safe]
    (ClusterSetInfo/initialize cluster-set thread-safe)))

(defn set-clusters-infos
  "clusters-infos - `java.util.Map`"
  ([^ClusterSetInfo this ^java.util.Map clusters-infos]
    (-> this (.setClustersInfos clusters-infos))))

(defn set-distances-between-clusters-centers
  "inter-cluster-distances - `com.google.common.collect.Table`"
  ([^ClusterSetInfo this ^com.google.common.collect.Table inter-cluster-distances]
    (-> this (.setDistancesBetweenClustersCenters inter-cluster-distances))))

(defn get-point-location-change
  "returns: `java.util.concurrent.atomic.AtomicInteger`"
  (^java.util.concurrent.atomic.AtomicInteger [^ClusterSetInfo this]
    (-> this (.getPointLocationChange))))

(defn remove-cluster-infos
  "clusters - `java.util.List`"
  ([^ClusterSetInfo this ^java.util.List clusters]
    (-> this (.removeClusterInfos clusters))))

(defn get-point-distance-from-cluster-variance
  "returns: `double`"
  (^Double [^ClusterSetInfo this]
    (-> this (.getPointDistanceFromClusterVariance))))

(defn set-point-location-change
  "point-location-change - `java.util.concurrent.atomic.AtomicInteger`"
  ([^ClusterSetInfo this ^java.util.concurrent.atomic.AtomicInteger point-location-change]
    (-> this (.setPointLocationChange point-location-change))))

(defn add-cluster-info
  "cluster-id - `java.lang.String`

  returns: `org.deeplearning4j.clustering.info.ClusterInfo`"
  (^org.deeplearning4j.clustering.info.ClusterInfo [^ClusterSetInfo this ^java.lang.String cluster-id]
    (-> this (.addClusterInfo cluster-id))))

(defn get-points-count
  "returns: `int`"
  (^Integer [^ClusterSetInfo this]
    (-> this (.getPointsCount))))

(defn get-distances-between-clusters-centers
  "returns: `com.google.common.collect.Table<java.lang.String,java.lang.String,java.lang.Double>`"
  (^com.google.common.collect.Table [^ClusterSetInfo this]
    (-> this (.getDistancesBetweenClustersCenters))))

(defn get-cluster-info
  "cluster-id - `java.lang.String`

  returns: `org.deeplearning4j.clustering.info.ClusterInfo`"
  (^org.deeplearning4j.clustering.info.ClusterInfo [^ClusterSetInfo this ^java.lang.String cluster-id]
    (-> this (.getClusterInfo cluster-id))))

(defn get-average-point-distance-from-cluster-center
  "returns: `double`"
  (^Double [^ClusterSetInfo this]
    (-> this (.getAveragePointDistanceFromClusterCenter))))

(defn get-clusters-infos
  "returns: `java.util.Map<java.lang.String,org.deeplearning4j.clustering.info.ClusterInfo>`"
  (^java.util.Map [^ClusterSetInfo this]
    (-> this (.getClustersInfos))))

