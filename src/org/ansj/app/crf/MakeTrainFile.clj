(ns org.ansj.app.crf.MakeTrainFile
  "生成crf 或者是 wapiti的训练语聊工具.
 执行:java org.ansj.app.crf.MakeTrainFile [inputPath] [outputPath]"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.app.crf MakeTrainFile]))

(defn ->make-train-file
  "Constructor."
  (^MakeTrainFile []
    (new MakeTrainFile )))

(defn *main
  "args - `java.lang.String[]`"
  ([args]
    (MakeTrainFile/main args)))

