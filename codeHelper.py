#!/usr/bin/env python
# -*- coding: utf-8 -*-
# filename: pexpect_test.py
'''
Created on 2010-7-2
@author: forever
'''

import pexpect


if __name__=='__main__':
    user = 'hadoop'    
    ip = '10.71.84.233'
    passwd = 'wyyhzc790204'
    print user
    child= pexpect.spawn('scp build/bin/sqoop_export_job_201302252250.jar   hadoop@jobtracker:/home/hadoop/sqoop/sqoop_export_job_201302252250_02.jar')
    print str(child)
    print "deploy file is ok! "
