(ns org.datavec.image.transform.ImageTransformProcess
  "Created by kepricon on 17. 5. 23."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.transform ImageTransformProcess]))

(defn ->image-transform-process
  "Constructor.

  seed - `int`
  transforms - `org.datavec.image.transform.ImageTransform`"
  (^ImageTransformProcess [^Integer seed ^org.datavec.image.transform.ImageTransform transforms]
    (new ImageTransformProcess seed transforms))
  (^ImageTransformProcess [^org.datavec.image.transform.ImageTransformProcess$Builder builder]
    (new ImageTransformProcess builder)))

(defn *from-json
  "Deserialize a JSON String (created by toJson()) to a ImageTransformProcess

  json - `java.lang.String`

  returns: ImageTransformProcess, from JSON - `org.datavec.image.transform.ImageTransformProcess`"
  (^org.datavec.image.transform.ImageTransformProcess [^java.lang.String json]
    (ImageTransformProcess/fromJson json)))

(defn *from-yaml
  "Deserialize a JSON String (created by toJson()) to a ImageTransformProcess

  yaml - `java.lang.String`

  returns: ImageTransformProcess, from JSON - `org.datavec.image.transform.ImageTransformProcess`"
  (^org.datavec.image.transform.ImageTransformProcess [^java.lang.String yaml]
    (ImageTransformProcess/fromYaml yaml)))

(defn execute
  "image - `java.util.List`

  returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^ImageTransformProcess this ^java.util.List image]
    (-> this (.execute image))))

(defn execute-array
  "image - `org.datavec.image.data.ImageWritable`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ImageTransformProcess this ^org.datavec.image.data.ImageWritable image]
    (-> this (.executeArray image))))

(defn transform-file-uri-to-input
  "uri - `java.net.URI`

  returns: `org.datavec.image.data.ImageWritable`

  throws: java.io.IOException"
  (^org.datavec.image.data.ImageWritable [^ImageTransformProcess this ^java.net.URI uri]
    (-> this (.transformFileUriToInput uri))))

(defn to-json
  "Convert the ImageTransformProcess to a JSON string

  returns: ImageTransformProcess, as JSON - `java.lang.String`"
  (^java.lang.String [^ImageTransformProcess this]
    (-> this (.toJson))))

(defn to-yaml
  "Convert the ImageTransformProcess to a YAML string

  returns: ImageTransformProcess, as YAML - `java.lang.String`"
  (^java.lang.String [^ImageTransformProcess this]
    (-> this (.toYaml))))

