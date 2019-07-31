(ns org.ansj.app.crf.Model
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.app.crf Model]))

(defn ->model
  "Constructor."
  (^Model []
    (new Model )))

(def *-logger
  "Static Constant.

  type: org.nlpcn.commons.lang.util.logging.Log"
  Model/logger)

(defn all-feature-count
  "Instance Field.

  type: int"
  (^Integer [^Model this]
    (-> this .-allFeatureCount)))

(defn *load
  "模型读取

  c - `java.lang.Class`
  is - `java.io.InputStream`

  returns: `org.ansj.app.crf.Model`

  throws: java.lang.Exception"
  (^org.ansj.app.crf.Model [^java.lang.Class c ^java.io.InputStream is]
    (Model/load c is))
  (^org.ansj.app.crf.Model [^java.lang.String model-path]
    (Model/load model-path)))

(defn check-model
  "判断当前数据流是否是本实例

  model-path - `java.lang.String`

  returns: `boolean`

  throws: java.io.IOException"
  (^Boolean [^Model this ^java.lang.String model-path]
    (-> this (.checkModel model-path))))

(defn load-model
  "不同的模型实现自己的加载模型类

  model-path - `java.lang.String`

  returns: `org.ansj.app.crf.Model`

  throws: java.lang.Exception"
  (^org.ansj.app.crf.Model [^Model this ^java.lang.String model-path]
    (-> this (.loadModel model-path))))

(defn get-feature
  "获得特征所在权重数组

  chars - `char`

  returns: `float[]`"
  ([^Model this ^Character chars]
    (-> this (.getFeature chars))))

(defn get-config
  "returns: `org.ansj.app.crf.Config`"
  (^org.ansj.app.crf.Config [^Model this]
    (-> this (.getConfig))))

(defn tag-rate
  "tag转移率

  s-1 - `int`
  s-2 - `int`

  returns: `float`"
  (^Float [^Model this ^Integer s-1 ^Integer s-2]
    (-> this (.tagRate s-1 s-2))))

(defn write-model
  "将model序列化到硬盘

  path - `java.lang.String`

  throws: java.io.IOException"
  ([^Model this ^java.lang.String path]
    (-> this (.writeModel path))))

