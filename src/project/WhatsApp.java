/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author l174630
 */
public class WhatsApp extends SocialMedia {

    @Override
    public void AddtoSocialMedia(Ad a) {
        LA.add(a);
        System.out.println("Shared to whatsapp");
    }
    
     @Override
    public void notifyEvent(Event e){
        System.out.println("Hey listen Whatsapp Users! OLX created an shopping event, "+e.title+" starting from "+e.start_date+" till "+e.end_date);
    }
}
