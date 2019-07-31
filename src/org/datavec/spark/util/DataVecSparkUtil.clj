(ns org.datavec.spark.util.DataVecSparkUtil
  "Utilities for using DataVec with Spark"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.util DataVecSparkUtil]))

(defn ->data-vec-spark-util
  "Constructor."
  (^DataVecSparkUtil []
    (new DataVecSparkUtil )))

(defn *combine-files-for-sequence-file
  "This is a convenience method to combine data from separate files together (intended to write to a sequence file, using
  JavaPairRDD.saveAsNewAPIHadoopFile(String, Class, Class, Class))
  A typical use case is to combine input and label data from different files, for later parsing by a RecordReader
  or SequenceRecordReader.
  A typical use case is as follows:
  Given two paths (directories), combine the files in these two directories into pairs.
  Then, for each pair of files, convert the file contents into a BytesPairWritable, which also contains
  the original file paths of the files.
  The assumptions are as follows:
  - For every file in the first directory, there is an equivalent file in the second directory (i.e., same key)
  - The pairing of files can be done based on the paths of the files; paths are mapped to a key using a PathToKeyConverter;
  keys are then matched to give pairs of files

  Example usage: to combine all files in directory dir1 with equivalent files in dir2, by file name:


   JavaSparkContext sc = ...;
   String path1 = \"/dir1\";
   String path2 = \"/dir2\";
   PathToKeyConverter pathConverter = new PathToKeyConverterFilename();
   JavaPairRDD<Text,BytesPairWritable> toWrite = DataVecSparkUtil.combineFilesForSequenceFile(sc, path1, path2, pathConverter, pathConverter );
   String outputPath = \"/my/output/path\";
   toWrite.saveAsNewAPIHadoopFile(outputPath, Text.class, BytesPairWritable.class, SequenceFileOutputFormat.class);
  Result: the file contexts aggregated (pairwise), written to a hadoop sequence file at /my/output/path

  sc - Spark context - `org.apache.spark.api.java.JavaSparkContext`
  path-1 - First directory (passed to JavaSparkContext.binaryFiles(path1)) - `java.lang.String`
  path-2 - Second directory (passed to JavaSparkContext.binaryFiles(path1)) - `java.lang.String`
  converter-1 - Converter, to convert file paths in first directory to a key (to allow files to be matched/paired by key) - `org.datavec.spark.functions.pairdata.PathToKeyConverter`
  converter-2 - As above, for second directory - `org.datavec.spark.functions.pairdata.PathToKeyConverter`

  returns: `org.apache.spark.api.java.JavaPairRDD<org.apache.hadoop.io.Text,org.datavec.spark.functions.pairdata.BytesPairWritable>`"
  (^org.apache.spark.api.java.JavaPairRDD [^org.apache.spark.api.java.JavaSparkContext sc ^java.lang.String path-1 ^java.lang.String path-2 ^org.datavec.spark.functions.pairdata.PathToKeyConverter converter-1 ^org.datavec.spark.functions.pairdata.PathToKeyConverter converter-2]
    (DataVecSparkUtil/combineFilesForSequenceFile sc path-1 path-2 converter-1 converter-2))
  (^org.apache.spark.api.java.JavaPairRDD [^org.apache.spark.api.java.JavaSparkContext sc ^java.lang.String path-1 ^java.lang.String path-2 ^org.datavec.spark.functions.pairdata.PathToKeyConverter converter]
    (DataVecSparkUtil/combineFilesForSequenceFile sc path-1 path-2 converter)))

