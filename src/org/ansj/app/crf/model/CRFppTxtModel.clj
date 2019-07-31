(ns org.ansj.app.crf.model.CRFppTxtModel
  "加载CRF+生成的crf文本模型,测试使用的CRF++版本为:CRF++-0.58
 下载地址:https://taku910.github.io/crfpp/#download 在这里感谢作者所做的工作."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.app.crf.model CRFppTxtModel]))

(defn ->cr-fpp-txt-model
  "Constructor."
  (^CRFppTxtModel []
    (new CRFppTxtModel )))

(defn load-model
  "解析crf++生成的可可视txt文件

  model-path - `java.lang.String`

  returns: `org.ansj.app.crf.model.CRFppTxtModel`

  throws: java.lang.Exception"
  (^org.ansj.app.crf.model.CRFppTxtModel [^CRFppTxtModel this ^java.lang.String model-path]
    (-> this (.loadModel model-path))))

(defn check-model
  "Description copied from class: Model

  model-path - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^CRFppTxtModel this ^java.lang.String model-path]
    (-> this (.checkModel model-path))))

