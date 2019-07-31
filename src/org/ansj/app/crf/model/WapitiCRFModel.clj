(ns org.ansj.app.crf.model.WapitiCRFModel
  "加载wapiti生成的crf模型,测试使用的wapiti版本为:Wapiti v1.5.0
 wapiti 下载地址:https://wapiti.limsi.fr/#download 在这里感谢作者所做的工作."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.app.crf.model WapitiCRFModel]))

(defn ->wapiti-crf-model
  "Constructor."
  (^WapitiCRFModel []
    (new WapitiCRFModel )))

(defn load-model
  "Description copied from class: Model

  model-path - `java.lang.String`

  returns: `org.ansj.app.crf.model.WapitiCRFModel`

  throws: java.lang.Exception"
  (^org.ansj.app.crf.model.WapitiCRFModel [^WapitiCRFModel this ^java.lang.String model-path]
    (-> this (.loadModel model-path))))

(defn check-model
  "Description copied from class: Model

  model-path - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^WapitiCRFModel this ^java.lang.String model-path]
    (-> this (.checkModel model-path))))

