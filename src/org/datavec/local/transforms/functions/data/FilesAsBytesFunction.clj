(ns org.datavec.local.transforms.functions.data.FilesAsBytesFunction
  "A PairFunction that simply loads bytes[] from a a PortableDataStream, and wraps it (and the String key)
 in Text and BytesWritable respectively."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.functions.data FilesAsBytesFunction]))

(defn ->files-as-bytes-function
  "Constructor."
  (^FilesAsBytesFunction []
    (new FilesAsBytesFunction )))

(defn apply
  "Description copied from interface: Function

  in - Input - `org.nd4j.linalg.primitives.Pair`

  returns: Result - `org.nd4j.linalg.primitives.Pair<org.datavec.api.writable.Text,org.datavec.api.writable.BytesWritable>`"
  (^org.nd4j.linalg.primitives.Pair [^FilesAsBytesFunction this ^org.nd4j.linalg.primitives.Pair in]
    (-> this (.apply in))))

