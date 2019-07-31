(ns org.deeplearning4j.rl4j.util.DataManager
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.util DataManager]))

(defn ->data-manager
  "Constructor.

  data-root - `java.lang.String`
  save-data - `boolean`

  throws: java.io.IOException"
  (^DataManager [^java.lang.String data-root ^Boolean save-data]
    (new DataManager data-root save-data))
  (^DataManager [^Boolean save-data]
    (new DataManager save-data))
  (^DataManager []
    (new DataManager )))

(defn *save
  "path - `java.lang.String`
  learning - `org.deeplearning4j.rl4j.learning.Learning`

  throws: java.io.IOException"
  ([^java.lang.String path ^org.deeplearning4j.rl4j.learning.Learning learning]
    (DataManager/save path learning)))

(defn *load
  "file - `java.io.File`
  c-class - `java.lang.Class`

  returns: `<C> org.nd4j.linalg.primitives.Pair<org.deeplearning4j.rl4j.network.dqn.IDQN,C>`

  throws: java.io.IOException"
  ([^java.io.File file ^java.lang.Class c-class]
    (DataManager/load file c-class)))

(defn create-subdir
  "returns: `java.lang.String`

  throws: java.io.IOException"
  (^java.lang.String [^DataManager this]
    (-> this (.createSubdir))))

(defn get-video-dir
  "returns: `java.lang.String`"
  (^java.lang.String [^DataManager this]
    (-> this (.getVideoDir))))

(defn get-model-dir
  "returns: `java.lang.String`"
  (^java.lang.String [^DataManager this]
    (-> this (.getModelDir))))

(defn get-info
  "returns: `java.lang.String`"
  (^java.lang.String [^DataManager this]
    (-> this (.getInfo))))

(defn get-stat
  "returns: `java.lang.String`"
  (^java.lang.String [^DataManager this]
    (-> this (.getStat))))

(defn append-stat
  "stat-entry - `org.deeplearning4j.rl4j.util.DataManager$StatEntry`

  throws: java.io.IOException"
  ([^DataManager this ^org.deeplearning4j.rl4j.util.DataManager$StatEntry stat-entry]
    (-> this (.appendStat stat-entry))))

(defn write-info
  "i-learning - `org.deeplearning4j.rl4j.learning.ILearning`

  throws: java.io.IOException"
  ([^DataManager this ^org.deeplearning4j.rl4j.learning.ILearning i-learning]
    (-> this (.writeInfo i-learning))))

(defn save
  "learning - `org.deeplearning4j.rl4j.learning.Learning`

  throws: java.io.IOException"
  ([^DataManager this ^org.deeplearning4j.rl4j.learning.Learning learning]
    (-> this (.save learning))))

