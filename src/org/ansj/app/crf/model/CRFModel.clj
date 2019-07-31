(ns org.ansj.app.crf.model.CRFModel
  "加载ansj格式的crfmodel,目前此model格式是通过crf++ 或者wapiti生成的"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.app.crf.model CRFModel]))

(defn ->crf-model
  "Constructor."
  (^CRFModel []
    (new CRFModel )))

(def *-version
  "Static Constant.

  type: java.lang.String"
  CRFModel/VERSION)

(defn load-model
  "Description copied from class: Model

  model-path - `java.lang.String`

  returns: `org.ansj.app.crf.model.CRFModel`

  throws: java.lang.Exception"
  (^org.ansj.app.crf.model.CRFModel [^CRFModel this ^java.lang.String model-path]
    (-> this (.loadModel model-path))))

(defn check-model
  "Description copied from class: Model

  model-path - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^CRFModel this ^java.lang.String model-path]
    (-> this (.checkModel model-path))))

