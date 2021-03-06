/**
 * Copyright (C) 2012 eXo Platform SAS.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package com.exoplatform.customerms;

import com.exoplatform.customerms.model.Customer;
import com.exoplatform.customerms.service.CustomerService;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.portlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * @author <a href="kienna@exoplatform.com">Kien Nguyen</a>
 * @version $Revision$
 */
public class CustomerMSController implements org.springframework.web.portlet.mvc.Controller, ApplicationContextAware
{
   private ApplicationContext context;
   
   public void handleActionRequest(ActionRequest request, ActionResponse response) throws Exception
   {

   }

   @Override
   public ModelAndView handleRenderRequest(RenderRequest request, RenderResponse response) throws Exception
   {
      CustomerService customerService = (CustomerService) context.getBean("customerService");
      
      List<Customer> list = customerService.findAllCustomer();
      for (Customer c : list)
      {
         System.out.println(c.getCustomerId() + " " + c.getName());
      }  
      System.out.println("fake some data");
      list = new ArrayList<Customer>();
      list.add(new Customer(1L, "Smith", "Macy 1", new Date()));
      list.add(new Customer(2L, "Kiera", "Macy 2", new Date()));
      list.add(new Customer(3L, "Ken", "Macy 3", new Date()));
      list.add(new Customer(4L, "Andrew 尹", "Macy 4", new Date()));
		
      
      Map<String, Object> model = new HashMap<String, Object>();
      //model.put("helloWorldMessage", "Hello World, a great day!");
      model.put("list", list);
      return new ModelAndView("list_customer", "list", list);
   }

   public void setApplicationContext(ApplicationContext context) throws BeansException
   {
      this.context = context;      
   }


}
