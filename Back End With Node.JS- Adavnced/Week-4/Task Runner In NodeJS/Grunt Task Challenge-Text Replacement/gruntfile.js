module.exports = function(grunt) {
    grunt.initConfig({
      pkg: grunt.file.readJSON('package.json'),
      replace: {
        dist: {
          options: {
            patterns: [
              {
                match: /ninjacoding\.com/g, 
                replacement: 'codingninjas.com' 
              }
            ]
          },
          files: [
            {
              expand: true,
              src: ['src/*.html'],
              dest: 'build/',
              flatten: true 
            }
          ]
        }
      }
    });
  
    // Load the Grunt plugins
    grunt.loadNpmTasks('grunt-replace');
  
    // Default task
    grunt.registerTask('default', ['replace']);
  };
  